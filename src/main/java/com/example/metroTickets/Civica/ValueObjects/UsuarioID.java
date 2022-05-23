package com.example.metroTickets.Civica.ValueObjects;

import co.com.sofka.domain.generic.Identity;

public class UsuarioID extends Identity {

    private UsuarioID(String value) {
        super(value);
    }

    public UsuarioID(){}

    public static UsuarioID of(String value) {
        return new UsuarioID(value);
    }
}
