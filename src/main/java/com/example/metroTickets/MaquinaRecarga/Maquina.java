package com.example.metroTickets.MaquinaRecarga;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import com.example.metroTickets.MaquinaRecarga.ValueObjects.Ayuda;
import com.example.metroTickets.MaquinaRecarga.ValueObjects.MaquinaID;

public class Maquina extends Entity<MaquinaID> {

    private Ayuda ayuda;

    public Maquina(MaquinaID entityid, Ayuda ayuda) {
        super(entityid);
        this.ayuda = ayuda;
    }

    public void contestarSolicitud(){}
}
