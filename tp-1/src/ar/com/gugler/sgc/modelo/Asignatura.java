package ar.com.gugler.sgc.modelo;

import java.util.List;
import java.util.Objects;

/**
 * Clase que representa una asignatura.
 */
public class Asignatura {

    private Integer codigo;
    private String nombre;
    private List<Alumno> alumnos;
    private Profesor profesor;

    /**
     * Constructor de la clase Asignatura.
     *
     * @param codigo    Código de la asignatura.
     * @param nombre    Nombre de la asignatura.
     * @param alumnos   Lista de alumnos inscritos en la asignatura.
     * @param profesor  Profesor de la asignatura.
     */
    public Asignatura(Integer codigo, String nombre, List<Alumno> alumnos, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.profesor = profesor;
    }

    /**
     * Constructor de la clase Asignatura sin alumnos y profesor.
     *
     * @param codigo  Código de la asignatura.
     * @param nombre  Nombre de la asignatura.
     */
    public Asignatura(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * Obtiene el código de la asignatura.
     *
     * @return Código de la asignatura.
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Establece el código de la asignatura.
     *
     * @param codigo Código de la asignatura.
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre de la asignatura.
     *
     * @return Nombre de la asignatura.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la asignatura.
     *
     * @param nombre Nombre de la asignatura.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la lista de alumnos inscritos en la asignatura.
     *
     * @return Lista de alumnos.
     */
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * Establece la lista de alumnos inscritos en la asignatura.
     *
     * @param alumnos Lista de alumnos.
     */
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * Obtiene el profesor de la asignatura.
     *
     * @return Profesor de la asignatura.
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Establece el profesor de la asignatura.
     *
     * @param profesor Profesor de la asignatura.
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return Objects.equals(codigo, that.codigo) && Objects.equals(nombre, that.nombre) && Objects.equals(alumnos, that.alumnos) && Objects.equals(profesor, that.profesor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, alumnos, profesor);
    }

    /**
     * Método para obtener una representación en forma de cadena de la asignatura.
     *
     * @return Representación en forma de cadena de la asignatura.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asignatura{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", alumnos=[");

        for (int i = 0; i < alumnos.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(alumnos.get(i));
        }

        sb.append("]");
        sb.append(", profesor=").append(profesor);
        sb.append('}');
        return sb.toString();
    }
}
