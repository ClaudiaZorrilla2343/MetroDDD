package com.example.metroTickets.Civica.ValueObjects;

import co.com.sofka.domain.generic.Identity;

public class CivicaID extends Identity {
    private CivicaID(String value) {
        super(value);
    }

    private CivicaID(){}

    public static CivicaID of(String value) {
        return new CivicaID(value);
    }
}
