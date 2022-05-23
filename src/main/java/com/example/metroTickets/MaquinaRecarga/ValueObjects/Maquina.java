package com.example.metroTickets.MaquinaRecarga.ValueObjects;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;

public class Maquina extends Entity<MaquinaID> {

    private Ayuda ayuda;

    public Maquina(MaquinaID entityid, Ayuda ayuda) {
        super(entityid);
        this.ayuda = ayuda;
    }

    public void contestarSolicitud(){}
}
