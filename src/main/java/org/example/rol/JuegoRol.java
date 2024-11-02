package org.example.rol;

class Personaje {
    protected String nombre;
    protected int puntosVida;

    public Personaje(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca a " + objetivo.nombre);
    }
}

class Guerrero extends Personaje {
    public Guerrero(String nombre, int puntosVida) {
        super(nombre, puntosVida);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " (Guerrero) ataca con su espada a " + objetivo.nombre);
    }
}

class Mago extends Personaje {
    public Mago(String nombre, int puntosVida) {
        super(nombre, puntosVida);
    }

    public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        System.out.println(nombre + " lanza " + hechizo.getNombre() + " a " + objetivo.nombre);
        objetivo.puntosVida -= hechizo.getDano();
    }
}

class Hechizo {
    private String nombre;
    private int dano;

    public Hechizo(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDano() {
        return dano;
    }
}
