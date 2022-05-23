package com.example.metroTickets.MaquinaRecarga;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.metroTickets.MaquinaRecarga.Events.Recarga;
import com.example.metroTickets.MaquinaRecarga.ValueObjects.*;

public class MaquinaRecarga extends AggregateEvent<MaquinaRecargaID> {

    protected Maquina maquina;
    protected Tarifa tarifa;
    protected Fecha fecha;
    protected Factura factura;

    public MaquinaRecarga(MaquinaRecargaID maquinaRecargaID) {
        super(maquinaRecargaID);
        appendChange(new Recarga(tarifa, fecha)).apply();
        subscribe(new MaquinaRecargaEventChange(this));
    }
}
