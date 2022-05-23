package com.example.metroTickets.MaquinaRecarga.Events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.metroTickets.MaquinaRecarga.ValueObjects.Fecha;
import com.example.metroTickets.MaquinaRecarga.ValueObjects.Tarifa;

public class Recarga extends DomainEvent {

    private final Tarifa tarifa;
    private final Fecha fecha;
    public Recarga(Tarifa tarifa, Fecha fecha) {
        super("com.example.metroTickets.MaquinaRecargaEventChange");
        this.fecha = fecha;
        this.tarifa = tarifa;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
