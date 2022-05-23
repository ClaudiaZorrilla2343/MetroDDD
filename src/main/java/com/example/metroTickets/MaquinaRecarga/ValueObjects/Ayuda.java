package com.example.metroTickets.MaquinaRecarga.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Ayuda implements ValueObject<String> {

    private String ayuda;

    public Ayuda(String ayuda) {
        this.ayuda = ayuda;
    }

    @Override
    public String value() {
        return this.ayuda;
    }
}
