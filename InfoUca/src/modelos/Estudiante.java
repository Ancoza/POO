package modelos;

public class Estudiante  {
        
        private String id;
	private String correo;
	private String nombre;
        private String apellido;
	private String numTel;
        private String password;
        private int estado;

    public Estudiante (){

	}
    
    public Estudiante(String id, String nombre, String apellido, 
            String correo,String numTel,String password, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numTel = numTel;
        this.password = password;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombres=" + 
                nombre + ", apellidos=" + apellido + 
                ", correo=" + correo + ", numTel=" +
                numTel + ", password="+ password + ", estado=" + estado + '}';
    }

        
}