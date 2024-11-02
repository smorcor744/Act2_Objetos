package org.example.estudiantes;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private int id;
    private List<Integer> calificaciones = new ArrayList<>();

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

    public double obtenerPromedio() {
        return calificaciones.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}

class Curso {
    private String nombre;
    private String codigo;

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
}

class Profesor {
    private String nombre;
    private int id;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void asignarCurso(Curso curso) {
        cursos.add(curso);
    }
}
