package org.example;

import java.util.ArrayList;

class Universidad {

    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Universidad() {
        this.estudiantes = new ArrayList<>();
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Universidad: ").append(nombre).append("\n");
        sb.append("Estudiantes:\n");

        for (Estudiante e : estudiantes) {
            sb.append("- ").append(e.getNombre()).append("\n");
        }

        return sb.toString();
    }
}
