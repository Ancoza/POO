package modelos;

public class Suscripcion {

    /**
     * true es activo false es cancelada
     */
    private boolean estado;
    private String idEstudiante;
    private String nomArea;
    private int estate;

    public Suscripcion() {

    }
    
    public boolean autenticarSuscripcion(String area) {
        
        if (this.nomArea.equals(area)) {
            return true;
        }
        return false;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public int getEstate() {
        return estate;
    }

    public void setEstate(int estate) {
        this.estate = estate;
    }

    public void finalize() throws Throwable {

    }

}
