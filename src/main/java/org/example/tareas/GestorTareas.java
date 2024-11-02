package org.example.tareas;

import java.util.ArrayList;
import java.util.List;

class Tarea {
    private String descripcion;
    private boolean completada = false;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }

    public void marcarCompletada() {
        completada = true;
    }

    public boolean isCompletada() {
        return completada;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

class Proyecto {
    private String nombre;
    private List<Tarea> tareas = new ArrayList<>();

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareasPendientes() {
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                System.out.println("Tarea pendiente: " + tarea.getDescripcion());
            }
        }
    }
}

class Usuario {
    private String nombre;
    private int id;
    private List<Proyecto> proyectos = new ArrayList<>();

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void crearProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }
}
