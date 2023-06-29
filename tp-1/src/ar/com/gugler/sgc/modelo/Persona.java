package ar.com.gugler.sgc.modelo;


import java.util.Objects;

public abstract class Persona {

    String numeroDocumento;
    String apellido;
    String nombre;
    int fechaNacimiento;
    String domicilio;
    String telefono;
    String correoElectronico;

    /**
     * Método abstracto para mostrar la información de la persona.
     *
     * @return Información de la persona.
     */
    public abstract String mostrarInformacion();


    /**
     * Constructor de la clase Persona.
     * @param numeroDocumento    Número de documento de la persona.
     * @param apellido           Apellido de la persona.
     * @param nombre             Nombre de la persona.
     * @param fechaNacimiento    Fecha de nacimiento de la persona.
     * @param domicilio          Domicilio de la persona.
     * @param telefono           Teléfono de la persona.
     * @param correoElectronico  Correo electrónico de la persona.
     */
    public Persona(String numeroDocumento,String apellido ,String nombre,int fechaNacimiento,String domicilio,String telefono,String correoElectronico) {
        this.numeroDocumento = numeroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene el número de documento de la persona.
     *
     * @return Número de documento.
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Establece el número de documento de la persona.
     *
     * @param numeroDocumento Número de documento.
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return Apellido.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido Apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return Nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre Nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona.
     *
     * @return Fecha de nacimiento.
     */
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     *
     * @param fechaNacimiento Fecha de nacimiento.
     */
    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el domicilio de la persona.
     *
     * @return Domicilio.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Establece el domicilio de la persona.
     *
     * @param domicilio Domicilio.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene el teléfono de la persona.
     *
     * @return Teléfono.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono de la persona.
     *
     * @param telefono Teléfono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo electrónico de la persona.
     *
     * @return Correo electrónico.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Establece el correo electrónico de la persona.
     *
     * @param correoElectronico Correo electrónico.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return fechaNacimiento == persona.fechaNacimiento && Objects.equals(numeroDocumento, persona.numeroDocumento) && Objects.equals(apellido, persona.apellido) && Objects.equals(nombre, persona.nombre) && Objects.equals(domicilio, persona.domicilio) && Objects.equals(telefono, persona.telefono) && Objects.equals(correoElectronico, persona.correoElectronico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDocumento, apellido, nombre, fechaNacimiento, domicilio, telefono, correoElectronico);
    }

    /**
     * Devuelve una representación en cadena de la persona.
     *
     * @return Cadena que representa a la persona.
     */
    @Override
    public String toString() {
        return "Persona{" +
                "numeroDocumento='" + numeroDocumento + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", domicilio='" + domicilio + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}

