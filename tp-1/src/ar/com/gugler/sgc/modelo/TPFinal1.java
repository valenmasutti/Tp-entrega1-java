package ar.com.gugler.sgc.modelo;

public class TPFinal1 {
    public static void main(String[] args) {

        /**
         * Instancie 2 objetos de tipo Alumno y un Profesor con valores válidos
         */
        Alumno alumno1 = new Alumno("44875650","Masutti","Valentino",2003,"Parana","54234234","valentinomasutti@gmail.com","1111");
        Alumno alumno2 = new Alumno("34543534","franco","juan",2004,"salta","54232323","juanfrancoi@gmail.com","2222");
        Profesor profesor1 = new Profesor("2323232","messi","leo",2003,"rosario","5432323","messi@gmail.com","9999", 17/20);


        /**
         * Llame al método mostrarDatos de la clase Universidad.
         */
          System.out.println(Universidad.mostrarDatos(alumno1));


        /**
         * Cree un curso con el nombre “Programación en Java” y agregue al Profesor y a los
         * Alumnos a dicho Curso.
         */
        Curso curso1 = new Curso(77, "Programación en Java", 24);
        curso1.agregarAlumno(alumno1); // Agregar alumno1 al curso
        curso1.agregarAlumno(alumno2); // Agregar alumno2 al curso
        curso1.setProfesor(profesor1); // Asignar el profesor1 al curso
        System.out.println("El curso admite inscripciones: " + curso1.admiteInscripciones());

        System.out.println(curso1.toString());


    }
}

