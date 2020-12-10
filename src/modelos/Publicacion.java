/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Antonio Meza
 */
public class Publicacion {

    private int id;
    private String area;
    private String descripcion;
    private String fecha;
    private int state;

    public Publicacion() {
    }

    public Publicacion(int id, String area, String descripcion, String fecha, int state) {
        this.id = id;
        this.area = area;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.state = state;
    }

   

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

}
