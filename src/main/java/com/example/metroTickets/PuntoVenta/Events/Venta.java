package com.example.metroTickets.PuntoVenta.Events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.metroTickets.PuntoVenta.ValueObjects.Fecha;
import com.example.metroTickets.PuntoVenta.ValueObjects.Tarifa;

public class Venta extends DomainEvent {
    private final Fecha fecha;
    private final Tarifa tarifa;
    public Venta(Tarifa tarifa, Fecha fecha) {
        super("com.example.metroTickets.Venta");
        this.fecha = fecha;
        this.tarifa = tarifa;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }
}
