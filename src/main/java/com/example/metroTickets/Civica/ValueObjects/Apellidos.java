package com.example.metroTickets.Civica.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Apellidos implements ValueObject<String> {

    private String apellidos;

    public Apellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String value() {
        return this.apellidos;
    }
}
