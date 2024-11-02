package org.example

class Libro(val titulo: String, val autor: String) {
    var prestado: Boolean = false
}

class Usuario(val nombre: String, val id: Int)

class Biblioteca {
    private val libros = mutableListOf<Libro>()
    private val usuarios = mutableListOf<Usuario>()
    private val prestamos = mutableMapOf<Usuario, MutableList<Libro>>()

    fun agregarLibro(libro: Libro) {
        libros.add(libro)
    }

    fun registrarUsuario(usuario: Usuario) {
        usuarios.add(usuario)
    }

    fun prestarLibro(usuario: Usuario, libro: Libro): Boolean {
        if (libro.prestado) {
            println("El libro ya está prestado.")
            return false
        }
        libro.prestado = true
        prestamos.computeIfAbsent(usuario) { mutableListOf() }.add(libro)
        return true
    }
}
