package ar.com.gugler.sgc.modelo;

import java.util.List;
import java.util.Objects;

/**
 * Clase que representa una materia, que es una especialización de una asignatura.
 */
public class Materia extends Asignatura {
    private Integer anio;

    /**
     * Constructor de la clase Materia.
     *
     * @param codigo   Código de la materia.
     * @param nombre   Nombre de la materia.
     * @param alumnos  Lista de alumnos inscritos en la materia.
     * @param profesor Profesor de la materia.
     * @param anio     Año de la materia.
     */
    public Materia(Integer codigo, String nombre, List<Alumno> alumnos, Profesor profesor, Integer anio) {
        super(codigo, nombre, alumnos, profesor);
        this.anio = anio;
    }

    /**
     * Obtiene el año de la materia.
     *
     * @return Año de la materia.
     */
    public Integer getAnio() {
        return anio;
    }

    /**
     * Establece el año de la materia.
     *
     * @param anio Año de la materia.
     */
    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Materia materia = (Materia) o;
        return Objects.equals(anio, materia.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), anio);
    }
}
