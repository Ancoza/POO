/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Publicacion;

/**
 *
 * @author Antonio Meza
 */
public class TablaPublicacion {

    public ArrayList<Publicacion> listaPublicacion = new ArrayList<>();
    private Conexion conex;

    public TablaSuscripcion tblSus;

    private Connection conn; // Gestiona la conexion.
    private PreparedStatement mostrarPublicacion;

    private PreparedStatement agregarPublicacion;
    private PreparedStatement eliminarPublicacion;

    public TablaPublicacion(Conexion conexion) {
        this.conex = conexion;

        try {
            conn = conex.obtenerConexion();
            mostrarPublicacion = conn.prepareStatement("Select * from Publicacion ");
            agregarPublicacion = conn.prepareStatement("Insert Into Publicacion(area,descripcion) Values(?, ?)");
            eliminarPublicacion = conn.prepareStatement("Delete from Publicacion Where estudiante = ? and area = ?");
            listaPublicacion = this.listarRegistros();
        } catch (SQLException ex) {
            Logger.getLogger(TablaSuscripcion.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
    }

    public TablaPublicacion(Conexion conexion, TablaSuscripcion tblSus) {
        this.conex = conexion;
        tblSus = tblSus;
        try {
            conn = conex.obtenerConexion();
            mostrarPublicacion = conn.prepareStatement("Select * from Publicacion ");
            listaPublicacion = this.listarRegistros();
        } catch (SQLException ex) {
            Logger.getLogger(TablaSuscripcion.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
    }

    public ArrayList<Publicacion> listarRegistros() {
        ArrayList<Publicacion> result = null;
        ResultSet rs = null;
        try {

            rs = mostrarPublicacion.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                Publicacion publ = new Publicacion();
                publ.setId(rs.getInt("id"));
                publ.setArea(rs.getString("area").trim());
                publ.setDescripcion(rs.getString("descripcion").trim());
                publ.setFecha(rs.getString("fecha"));

                result.add(publ);
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

    public int agregarRegistro(String area, String descripcion) {
        int result = 0;
        try {
            agregarPublicacion.setString(1, area);
            agregarPublicacion.setString(2, descripcion);

            //  result=1;
            result = agregarPublicacion.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conex.close(conn);
        }
        return result;
    }

    public DefaultTableModel mostrarNotificaciones() {
        DefaultTableModel tbl = new DefaultTableModel();
        try {
            String titulos[] = {"Mensaje", "Area", "Fecha"};
            tbl.setColumnIdentifiers(titulos);
            for (int i = 0; i < tblSus.listaSuscripciones.size(); i++) {
                String area = tblSus.listaSuscripciones.get(i).getNomArea();
                for (Publicacion p : this.listaPublicacion) {
                    Object[] o = new Object[3];
                    o[0] = p.getDescripcion();
                    o[1] = p.getArea();
                    o[3] = p.getFecha();
                    tbl.addRow(o);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
        return tbl;
    }

}
