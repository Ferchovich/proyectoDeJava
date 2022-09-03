package clases;

public class Usuario
{
    private String nombre;
    private String apellido;
    private String usuario;
    private String sexo;
    private String contrasenia;
    private int id;
    
    public Usuario(final int id, final String nombre, final String apellido, final String usuario, final String sexo, final String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.sexo = sexo;
        this.contrasenia = contrasenia;
    }
    
    public Usuario(final String nombre, final String apellido, final String usuario, final String sexo, final String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.sexo = sexo;
        this.contrasenia = contrasenia;
    }
    
    public Usuario() {
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", sexo=" + sexo + ", contrasenia=" + contrasenia + ", id=" + id + '}';
    }
    
    
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(final String apellido) {
        this.apellido = apellido;
    }
    
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(final String usuario) {
        this.usuario = usuario;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(final String sexo) {
        this.sexo = sexo;
    }
    
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia( String contrasenia) {
        this.contrasenia = contrasenia;
    }
}