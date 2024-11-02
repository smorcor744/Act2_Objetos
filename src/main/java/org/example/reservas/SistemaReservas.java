package org.example.reservas;
import java.util.ArrayList;
import java.util.List;

class Habitacion {
    private int numero;
    private String tipo;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }
}

class Cliente {
    private String nombre;
    private int id;

    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
}

class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;

    public Reserva(Habitacion habitacion, Cliente cliente) {
        this.habitacion = habitacion;
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

class SistemaReservas {
    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public boolean reservarHabitacion(Cliente cliente, Habitacion habitacion) {
        for (Reserva reserva : reservas) {
            if (reserva.getHabitacion() == habitacion) {
                System.out.println("La habitación ya está reservada.");
                return false;
            }
        }
        reservas.add(new Reserva(habitacion, cliente));
        return true;
    }

    public void cancelarReserva(Cliente cliente, Habitacion habitacion) {
        reservas.removeIf(reserva -> reserva.getCliente() == cliente && reserva.getHabitacion() == habitacion);
    }

    public void mostrarReservasActivas() {
        for (Reserva reserva : reservas) {
            System.out.println("Habitación " + reserva.getHabitacion().getNumero() +
                    " reservada por " + reserva.getCliente().getNombre());
        }
    }
}
