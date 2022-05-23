package com.example.metroTickets.MaquinaRecarga;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.metroTickets.MaquinaRecarga.ValueObjects.*;

public class MaquinaRecarga extends AggregateEvent<MaquinaRecargaID> {

    protected Maquina maquina;
    private Tarifa tarifa;
    private Fecha fecha;
    private Factura factura;

    public MaquinaRecarga(MaquinaRecargaID maquinaRecargaID) {
        super(maquinaRecargaID);
    }
}
