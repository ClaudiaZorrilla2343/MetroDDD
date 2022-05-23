package com.example.metroTickets.Civica;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.metroTickets.Civica.ValueObjects.CivicaID;
import com.example.metroTickets.Civica.ValueObjects.TipoTarjeta;

public class Civica extends AggregateEvent<CivicaID> {

    private TipoTarjeta tipoTarjeta;
    private Usuario usuario;

    public Civica(CivicaID civicaID) {
        super(civicaID);
    }
}
