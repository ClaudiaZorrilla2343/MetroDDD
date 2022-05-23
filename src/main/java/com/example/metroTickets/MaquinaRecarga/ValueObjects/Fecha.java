package com.example.metroTickets.MaquinaRecarga.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Fecha implements ValueObject<String> {
    private String fecha;

    public Fecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String value() {
        return this.fecha;
    }
}
