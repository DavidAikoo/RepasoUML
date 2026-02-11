package org.example;

import java.util.ArrayList;

class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Universidad: " + nombre);
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre());
        }
    }
}
