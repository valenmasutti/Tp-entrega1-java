package ar.com.gugler.sgc.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase que representa un curso, que es una especialización de una asignatura y que implementa la interfaz IAdministrable.
 */
public class Curso extends Asignatura implements IAdministrable {
    private Integer cupo;

    /**
     * Constructor de la clase Curso.
     *
     * @param codigo Código del curso.
     * @param nombre Nombre del curso.
     * @param cupo   Cupo máximo de alumnos para el curso.
     */
    public Curso(Integer codigo, String nombre, Integer cupo) {
        super(codigo, nombre);
        this.cupo = cupo;
        this.setAlumnos(new ArrayList<>()); // Inicializa la lista de alumnos como una nueva instancia de ArrayList
    }

    /**
     * Obtiene el cupo máximo de alumnos para el curso.
     *
     * @return Cupo máximo de alumnos.
     */
    public Integer getCupo() {
        return cupo;
    }

    /**
     * Establece el cupo máximo de alumnos para el curso.
     *
     * @param cupo Cupo máximo de alumnos.
     */
    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    /**
     * Agrega un alumno al curso.
     *
     * @param alumno Alumno a agregar.
     */
    public void agregarAlumno(Alumno alumno) {
        getAlumnos().add(alumno);
    }

    /**
     * Elimina un alumno del curso.
     *
     * @param alumno Alumno a eliminar.
     */
    public void eliminarAlumno(Alumno alumno) {
        getAlumnos().remove(alumno);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Curso curso = (Curso) o;
        return Objects.equals(cupo, curso.cupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cupo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso{");
        sb.append(super.toString()); // Llama al método toString() de la clase Asignatura
        sb.append(", cupo=").append(cupo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * metodo para saber si hay cupos disponilbe
     * @return verdadero o falso dependiendo si hay cupo o no
     */
    @Override
    public boolean admiteInscripciones() {
        int cantidadAlumnosInscritos = getAlumnos().size();

        if (cantidadAlumnosInscritos < getCupo()) {
            return true;
        } else {
            return false;
        }
    }
}
