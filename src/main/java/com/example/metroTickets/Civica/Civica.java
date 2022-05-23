package com.example.metroTickets.Civica;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.metroTickets.Civica.ValueObjects.CivicaID;
import com.example.metroTickets.Civica.ValueObjects.TipoTarjeta;
import com.example.metroTickets.PuntoVenta.Events.Venta;
import com.example.metroTickets.PuntoVenta.VentaEventChange;

public class Civica extends AggregateEvent<CivicaID> {

    protected TipoTarjeta tipoTarjeta;
    protected Usuario usuario;

    public Civica(CivicaID civicaID, TipoTarjeta tipoTarjeta, Usuario usuario) {
        super(civicaID);
        appendChange(new Asignacion(tipoTarjeta, usuario)).apply();
        subscribe(new CivivaEventChange(this));
    }
}
