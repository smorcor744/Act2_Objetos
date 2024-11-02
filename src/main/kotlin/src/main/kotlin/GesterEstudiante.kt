package org.example

class Estudiante(val nombre: String, val id: Int) {
    private val calificaciones = mutableListOf<Int>()

    fun agregarCalificacion(calificacion: Int) {
        calificaciones.add(calificacion)
    }

    fun obtenerPromedio(): Double {
        return if (calificaciones.isNotEmpty()) calificaciones.average() else 0.0
    }
}

data class Curso(val nombre: String, val codigo: String)

class Profesor(val nombre: String, val id: Int) {
    private val cursos = mutableListOf<Curso>()

    fun asignarCurso(curso: Curso) {
        cursos.add(curso)
    }
}
