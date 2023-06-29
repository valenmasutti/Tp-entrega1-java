package ar.com.gugler.sgc.modelo;


import java.util.Objects;

/**
 * Clase que representa a un alumno.
 */
public class Alumno extends Persona{

    private String legajo;

    /**
     * Constructor de la clase Alumno.
     *
     * @param numeroDocumento    Número de documento del alumno.
     * @param apellido           Apellido del alumno.
     * @param nombres            Nombres del alumno.
     * @param fechaNacimiento    Fecha de nacimiento del alumno.
     * @param domicilio          Domicilio del alumno.
     * @param telefono           Teléfono del alumno.
     * @param correoElectronico  Correo electrónico del alumno.
     * @param legajo             Legajo del alumno.
     */
    public Alumno(String numeroDocumento, String apellido, String nombres, int fechaNacimiento, String domicilio, String telefono, String correoElectronico, String legajo) {
        super(numeroDocumento, apellido, nombres, fechaNacimiento, domicilio, telefono, correoElectronico);
        this.legajo = legajo;
    }

    /**
     * Obtiene el legajo del alumno.
     *
     * @return Legajo.
     */
    public String getLegajo() {
        return legajo;
    }

    /**
     * Establece el legajo del alumno.
     *
     * @param legajo Legajo.
     */
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(legajo, alumno.legajo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo);
    }

    /**
     * Método para mostrar la información del alumno.
     *
     * @return Información del alumno.
     */
    @Override
    public String mostrarInformacion() {
        return "Alumno{" +
                "numeroDocumento='" + numeroDocumento + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
