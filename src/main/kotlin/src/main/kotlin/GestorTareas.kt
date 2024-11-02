package org.example

class Tarea(val descripcion: String) {
    var completada: Boolean = false

    fun marcarCompletada() {
        completada = true
    }
}

class Proyecto(val nombre: String) {
    private val tareas = mutableListOf<Tarea>()

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }

    fun mostrarTareasPendientes() {
        tareas.filter { !it.completada }.forEach { println("Tarea pendiente: ${it.descripcion}") }
    }
}

class Usuario(val nombre: String, val id: Int) {
    private val proyectos = mutableListOf<Proyecto>()

    fun crearProyecto(proyecto: Proyecto) {
        proyectos.add(proyecto)
    }
}
