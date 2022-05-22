package com.example.metroTickets.PuntoVenta.ValueObjects;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {

    private String nombre;

    public Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String value() {
        return this.nombre;
    }
}
