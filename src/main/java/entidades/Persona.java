package entidades;

public class Persona {

    private Long idPersona;
    private String identificacion;
    private String nombre;
    private String fechaNacimiento;
    private Direccion direccion;

    public Persona() {
    }

    public Persona(String identificacion, String nombre, String fechaNacimiento, Direccion direccion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
