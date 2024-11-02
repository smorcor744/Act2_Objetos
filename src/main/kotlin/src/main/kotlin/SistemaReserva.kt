package org.example

data class Habitacion(val numero: Int, val tipo: String)

data class Cliente(val nombre: String, val id: Int)

data class Reserva(val habitacion: Habitacion, val cliente: Cliente)

class SistemaReservas {
    private val habitaciones = mutableListOf<Habitacion>()
    private val reservas = mutableListOf<Reserva>()

    fun agregarHabitacion(habitacion: Habitacion) {
        habitaciones.add(habitacion)
    }

    fun reservarHabitacion(cliente: Cliente, habitacion: Habitacion): Boolean {
        if (reservas.any { it.habitacion == habitacion }) {
            println("La habitación ya está reservada.")
            return false
        }
        reservas.add(Reserva(habitacion, cliente))
        return true
    }

    fun cancelarReserva(cliente: Cliente, habitacion: Habitacion) {
        reservas.removeIf { it.cliente == cliente && it.habitacion == habitacion }
    }

    fun mostrarReservasActivas() {
        reservas.forEach { reserva ->
            println("Habitación ${reserva.habitacion.numero} reservada por ${reserva.cliente.nombre}")
        }
    }
}
