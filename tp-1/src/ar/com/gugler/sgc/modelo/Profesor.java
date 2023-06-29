package ar.com.gugler.sgc.modelo;


import java.util.Objects;

/**
 * Clase que representa a un profesor.
 */
public class Profesor extends Persona {
    private String cuil;
    private int fechaIngreso;

    /**
     * Constructor de la clase Profesor.
     *
     * @param numeroDocumento    Número de documento del profesor.
     * @param apellido           Apellido del profesor.
     * @param nombres            Nombres del profesor.
     * @param fechaNacimiento    Fecha de nacimiento del profesor.
     * @param domicilio          Domicilio del profesor.
     * @param telefono           Teléfono del profesor.
     * @param correoElectronico  Correo electrónico del profesor.
     * @param cuil               CUIL del profesor.
     * @param fechaIngreso       Fecha de ingreso del profesor.
     */
    public Profesor(String numeroDocumento, String apellido, String nombres, int fechaNacimiento, String domicilio, String telefono, String correoElectronico, String cuil, int fechaIngreso) {
        super(numeroDocumento, apellido, nombres, fechaNacimiento, domicilio, telefono, correoElectronico);
        this.cuil = cuil;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Obtiene el CUIL del profesor.
     *
     * @return CUIL.
     */
    public String getCuil() {
        return cuil;
    }

    /**
     * Establece el CUIL del profesor.
     *
     * @param cuil CUIL.
     */
    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    /**
     * Obtiene la fecha de ingreso del profesor.
     *
     * @return Fecha de ingreso.
     */
    public int getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Establece la fecha de ingreso del profesor.
     *
     * @param fechaIngreso Fecha de ingreso.
     */
    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Profesor profesor = (Profesor) o;
        return fechaIngreso == profesor.fechaIngreso && Objects.equals(cuil, profesor.cuil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cuil, fechaIngreso);
    }

    /**
     * Método para mostrar la información del profesor.
     *
     * @return Información del profesor.
     */
    @Override
    public String mostrarInformacion() {
        return "Profesor{" +
                "cuil='" + cuil + '\'' +
                ", apellido='" + getApellido().toUpperCase() + '\'' +
                ", nombre='" + getNombre().toUpperCase() + '\'' +
                '}';
    }
}
