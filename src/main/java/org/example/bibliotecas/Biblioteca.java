package org.example.bibliotecas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Libro {
    private String titulo;
    private String autor;
    private boolean prestado = false;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }
}

class Usuario {
    private String nombre;
    private int id;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
}

class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private Map<Usuario, List<Libro>> prestamos = new HashMap<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean prestarLibro(Usuario usuario, Libro libro) {
        if (libro.isPrestado()) {
            System.out.println("El libro ya está prestado.");
            return false;
        }
        libro.setPrestado(true);
        prestamos.computeIfAbsent(usuario, k -> new ArrayList<>()).add(libro);
        return true;
    }
}
