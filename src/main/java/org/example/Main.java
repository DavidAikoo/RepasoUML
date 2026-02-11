package org.example;

public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Carlos");
        Estudiante e2 = new Estudiante("María");

        Universidad u = new Universidad("Universidad de Cundinamarca");

        u.agregarEstudiante(e1);
        u.agregarEstudiante(e2);

        u.mostrarEstudiantes();
    }
}
