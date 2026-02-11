package org.example;

public class Main {
    public static void main(String[] args) {

        // CREAR ESTUDIANTES
        Estudiante e1 = new Estudiante("Carlos");
        Estudiante e2 = new Estudiante("María");

        // CREAR UNIVERSIDAD
        Universidad u = new Universidad("Universidad Nacional");

        // AGREGAR ESTUDIANTES
        u.agregarEstudiante(e1);
        u.agregarEstudiante(e2);

        u.mostrarEstudiantes();
    }
}
