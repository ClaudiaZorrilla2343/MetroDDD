package com.example.metroTickets.PuntoVenta.ValueObjects;

import co.com.sofka.domain.generic.Identity;

public class EmpleadoID extends Identity {

    private EmpleadoID(String value) {
        super(value);
    }

    public EmpleadoID(){}

    public static EmpleadoID of(String value) {
        return new EmpleadoID(value);
    }
}
