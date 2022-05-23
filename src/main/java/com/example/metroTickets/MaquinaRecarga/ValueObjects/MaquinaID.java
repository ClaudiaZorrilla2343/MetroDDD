package com.example.metroTickets.MaquinaRecarga.ValueObjects;

import co.com.sofka.domain.generic.Identity;

public class MaquinaID extends Identity {

    private MaquinaID(String value){
        super(value);
    }

    public MaquinaID(){}

    public static MaquinaID of( String value) {
        return new MaquinaID(value);
    }

}
