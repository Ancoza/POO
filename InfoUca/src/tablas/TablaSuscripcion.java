package tablas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import modelos.Estudiante;
import modelos.Suscripcion;

public class TablaSuscripcion {
    
    private String idEst ;

    public ArrayList<Suscripcion> listaSuscripciones = new ArrayList<>();
    private Conexion conex;

    private Connection conn; // Gestiona la conexion.
    private PreparedStatement mostrarSuscripcion;
    private PreparedStatement mostrarSuscripcionEst;
    private PreparedStatement agregarSuscripcion;
    private PreparedStatement eliminarSuscripcion;
    private PreparedStatement verificarSuscripcion;

    public TablaSuscripcion(Conexion conexion) {
        this.conex = conexion;
        
        try {
            conn = conex.obtenerConexion();
            mostrarSuscripcion = conn.prepareStatement("Select * from Suscripcion ");
            mostrarSuscripcionEst= conn.prepareStatement("Select * from Suscripcion where estudiante =? ");
            agregarSuscripcion = conn.prepareStatement("Insert Into Suscripcion(estudiante,area) Values(?, ?)");
            eliminarSuscripcion = conn.prepareStatement("Delete from Suscripcion Where estudiante = ? and area=?");
            verificarSuscripcion = conn.prepareStatement("Select area from Suscripcion where Estudiante=?" );
            listaSuscripciones = this.listarRegistros();
        } catch (SQLException ex) {
            Logger.getLogger(TablaSuscripcion.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
    }

    public TablaSuscripcion(Conexion conexion, String est) {
        this.conex = conexion;
        idEst = est;
        try {
            conn = conex.obtenerConexion();
            mostrarSuscripcion = conn.prepareStatement("Select * from Suscripcion ");
            mostrarSuscripcionEst= conn.prepareStatement("Select * from Suscripcion where estudiante =? ");
            agregarSuscripcion = conn.prepareStatement("Insert Into Suscripcion(estudiante,area) Values(?, ?)");
            eliminarSuscripcion = conn.prepareStatement("Delete from Suscripcion Where estudiante = ? and area=?");
            verificarSuscripcion = conn.prepareStatement("Select area from Suscripcion where Estudiante=?");
            listaSuscripciones = this.listarRegistros(idEst);
        } catch (SQLException ex) {
            Logger.getLogger(TablaSuscripcion.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
    }
    
    public ArrayList<Suscripcion> listarRegistros() {
        ArrayList<Suscripcion> result = null;
        ResultSet rs = null;
        try {
            
            rs = mostrarSuscripcion.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                Suscripcion sus = new Suscripcion();
                sus.setIdEstudiante(rs.getString("estudiante").trim());
                sus.setNomArea(rs.getString("area").trim());
                sus.setEstado(rs.getBoolean("estado"));
                sus.setEstate(1);
                result.add(sus);
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

    public ArrayList<Suscripcion> listarRegistros(String est) {
        ArrayList<Suscripcion> result = null;
        ResultSet rs = null;
        try {
            mostrarSuscripcionEst.setString(1, est);
            rs = mostrarSuscripcionEst.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                Suscripcion sus = new Suscripcion();
                sus.setIdEstudiante(rs.getString("estudiante").trim());
                sus.setNomArea(rs.getString("area").trim());
                sus.setEstado(rs.getBoolean("estado"));
                sus.setEstate(1);
                result.add(sus);
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
    
    
        public int verificarSuscripcion(String id,String area){
        int b = 0;
        try{
            for(Suscripcion e : listaSuscripciones){
                if (e.autenticarSuscripcion(area)){
                    b=1;
                    break;
                }
            }
        }catch(Exception ex){
            System.out.println(""+ ex.getMessage());
        }
        return b;
    }
    
    public int agregarRegistro(String estudiante, String area,boolean estado) {
        int result = 0;
        try {
            agregarSuscripcion.setString(1, estudiante);
            agregarSuscripcion.setString(2, area);
            
          //  result=1;
            result = agregarSuscripcion.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conex.close(conn);
        }
        return result;
    }
   
    public int eliminarRegistro(String estudiante, String area) {
        int result = 0;
        try {
            eliminarSuscripcion.setString(1, estudiante);
            eliminarSuscripcion.setString(2, area);

            result = eliminarSuscripcion.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conex.close(conn);
        }
        return result;
    }
    
    public DefaultComboBoxModel listarArea(){
        DefaultComboBoxModel combobox = new DefaultComboBoxModel();
        try{
            for(Suscripcion s: listaSuscripciones){
                combobox.addElement(s.getNomArea());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return combobox;
        
    }
    
}