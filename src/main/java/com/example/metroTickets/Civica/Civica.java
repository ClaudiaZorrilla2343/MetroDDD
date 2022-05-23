package com.example.metroTickets.Civica;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.metroTickets.Civica.Events.Asignacion;
import com.example.metroTickets.Civica.ValueObjects.CivicaID;
import com.example.metroTickets.Civica.ValueObjects.TipoTarjeta;

public class Civica extends AggregateEvent<CivicaID> {

    protected TipoTarjeta tipoTarjeta;
    protected Usuario usuario;

    public Civica(CivicaID civicaID, TipoTarjeta tipoTarjeta, Usuario usuario) {
        super(civicaID);
        appendChange(new Asignacion(tipoTarjeta, usuario)).apply();
        subscribe(new CivivaEventChange(this));
    }
}
