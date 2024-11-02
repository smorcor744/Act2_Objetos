package org.example

interface Personaje {
    val nombre: String
    var puntosVida: Int
    open fun atacar(objetivo: Personaje) {
        println("$nombre ataca a ${objetivo.nombre}")
    }
}

class Guerrero(override val nombre: String, override var puntosVida: Int) : Personaje {
    override fun atacar(objetivo: Personaje) {
        println("$nombre (Guerrero) ataca con su espada a ${objetivo.nombre}")
    }
}

class Mago(override val nombre: String, override var puntosVida: Int) : Personaje {
    fun lanzarHechizo(hechizo: Hechizo, objetivo: Personaje) {
        println("$nombre lanza ${hechizo.nombre} a ${objetivo.nombre}")
        objetivo.puntosVida -= hechizo.dano
    }
}

data class Hechizo(val nombre: String, val dano: Int)
