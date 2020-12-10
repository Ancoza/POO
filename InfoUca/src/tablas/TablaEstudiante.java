package tablas;

import modelos.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TablaEstudiante {

    public ArrayList<Estudiante> lista = new ArrayList<>();
    private Conexion conex;

    private Connection conn; // Gestiona la conexion.
    private PreparedStatement mostrarEstudiante;
    private PreparedStatement insertarEstudiante;
    private PreparedStatement modificarEstudiante;
    private PreparedStatement eliminarEstudiante;
    private PreparedStatement mostrardatos;


    public TablaEstudiante(Conexion conexion) {
        this.conex = conexion;
        try {
            conn = conex.obtenerConexion();
            mostrarEstudiante = conn.prepareStatement("Select * from Estudiante");
            insertarEstudiante = conn.prepareStatement("Insert Into Estudiante(id, nombres, apellidos, correo, numTel, password) Values(?, ?, ?, ?, ?, ?)");
            modificarEstudiante = conn.prepareStatement("Update Estudiante Set nombres = ?, apellidos  =?, correo= ?, numTel =?, password=? Where id= ?");
            eliminarEstudiante = conn.prepareStatement("Delete from Estudiante Where id = ?");
            mostrardatos= conn.prepareStatement("Select * from Estudiante where id = ?");
            lista = this.listarRegistros();
        } catch (SQLException ex) {
            Logger.getLogger(TablaEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
    }

    public ArrayList<Estudiante> listarRegistros() {
        ArrayList<Estudiante> result = null;
        ResultSet rs = null;
        try {
            rs = mostrarEstudiante.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                Estudiante est = new Estudiante();
                est.setId(rs.getString("id").trim());
                est.setNombre(rs.getString("nombres").trim());
                est.setApellido(rs.getString("apellidos").trim());
                est.setCorreo(rs.getString("correo").trim());
                est.setNumTel(rs.getString("numTel").trim());
                est.setPassword(rs.getString("password").trim());
                est.setEstado(1);
                result.add(est);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                conex.close(conn);
            }
        }
        return result;
    }
    
    public int agregarRegistro(String id, String nombres, String apellidos, String correo, String numTel, String password) {
        int result = 0;
        try {
            insertarEstudiante.setString(1, id);
            insertarEstudiante.setString(2, nombres);
            insertarEstudiante.setString(3, apellidos);
            insertarEstudiante.setString(4, correo);
            insertarEstudiante.setString(5, numTel);
            insertarEstudiante.setString(6, password);
            result = insertarEstudiante.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conex.close(conn);
        }
        return result;
    }

    public int modificarRegistro(String nombres, String apellidos, String correo, String numTel, String password, String id) {
        int result = 0;
        try {
            modificarEstudiante.setString(1, nombres);
            modificarEstudiante.setString(2, apellidos);
            modificarEstudiante.setString(3, correo);
            modificarEstudiante.setString(4, numTel);
            modificarEstudiante.setString(5, password);
            modificarEstudiante.setString(6, id);
            result = modificarEstudiante.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conex.close(conn);
        }
        return result;
    }
   
    public int eliminarRegistro(String id) {
        int result = 0;
        try {
            eliminarEstudiante.setString(1, id);

            result = eliminarEstudiante.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conex.close(conn);
        }
        return result;
    }
    
    public int autenticarEstudiante(String id, String pw){
        int b = 0;
        try{
            for(Estudiante e : lista){
                if (e.autenticar(id, pw)){
                    b=1;
                    break;
                }
            }
        }catch(Exception ex){
            System.out.println(""+ ex.getMessage());
        }
        return b;
    }
    
    public int autenticarId(String id){
        int b = 0;
        try{
            for(Estudiante e : lista){
                if (e.autenticarId(id)){
                    b=1;
                    break;
                }
            }
        }catch(Exception ex){
            System.out.println(""+ ex.getMessage());
        }
        return b;
    }
    public String mostrardatos(String id){
        String d="Error";
        try{
            for(Estudiante e : lista){
                if (e.autenticarId(id)){
                    String a=e.getId()+e.getNombre()+e.getApellido()+e.getCorreo()+e.getNumTel();
                    return a;
                }else{return d;}
            }
        }catch(Exception ex){
            System.out.println(""+ ex.getMessage());
        }
        return null;
    }

    public String actualizarBD() {
        String msn = "";
        String msnError = "Errores en: ";
        for (Estudiante estudiante : lista) {
            System.out.println("Estudiante " + estudiante.getId() + ", Estado: " + estudiante.getEstado());
            switch (estudiante.getEstado()) {
                case 1:
                    //Si es original no hace nada
                    break;
                case 2:
                    //Estado modificado
                    if (this.modificarRegistro(estudiante.getNombre(), estudiante.getApellido(), estudiante.getCorreo(),estudiante.getNumTel(),estudiante.getPassword(), estudiante.getId()) != 0) {                      
                    } else {
                        msnError += "\n - Error al modificar: " + estudiante.getId();
                    }
                    break;
                case 3:
                    //Estado eliminado
                    if (this.eliminarRegistro(estudiante.getId()) != 0) {
                    } else {
                        msnError += "\n - Error al eliminar: " + estudiante.getId();
                    }
                    break;
                case 4:
                    //Estado nuevo registro                 
                    if (this.agregarRegistro(estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(), estudiante.getCorreo(),estudiante.getNumTel(),estudiante.getPassword()) != 0) {     
                    } else {
                        msnError += "\n -Error al agregar nuevo registro: " + estudiante.getId();
                    }
                    break;
                default:
                    msnError += "\n Revise el registro: " + estudiante.getId();
                    break;
            }
        }
        if (!msnError.equals("Errores en: ")) {
            msn += "\n" + msnError;
        }
        return msn;
    }
       
    public Estudiante mostrarRegistros(String id) {
        Estudiante est = new Estudiante();
        ResultSet rs = null;
        try {
            mostrardatos.setString(1, id);
            rs = mostrardatos.executeQuery();
            
            if (rs.next()) {
                
                est.setId(rs.getString("id").trim());
                est.setNombre(rs.getString("nombres").trim());
                est.setApellido(rs.getString("apellidos").trim());
                est.setCorreo(rs.getString("correo").trim());
                est.setNumTel(rs.getString("numTel").trim());
                est.setEstado(1);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                conex.close(conn);
            }
        }
        return est;
    }   
    
    public Estudiante mostarDatosEstudiante(String id){
        Estudiante est = null ;
        try{
            for(Estudiante e : lista){
                System.out.println("Id en el arreglo "+ e.getId() + " id envaido " + id+".");
                if (e.getId().equals(id)){
                    est = e;
                    System.out.println("te encntre");
                    break;
                    
                }
            }
            
            System.out.println("no te encontre");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return est;
    }

    
}
