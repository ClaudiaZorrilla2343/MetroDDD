package com.example.metroTickets.Civica.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {

    private String nombre;

    public Nombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String value() {
        return this.nombre;
    }
}
