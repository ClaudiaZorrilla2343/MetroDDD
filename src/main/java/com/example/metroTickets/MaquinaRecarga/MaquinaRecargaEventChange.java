package com.example.metroTickets.MaquinaRecarga;

import co.com.sofka.domain.generic.EventChange;
import com.example.metroTickets.MaquinaRecarga.Events.Recarga;

public class MaquinaRecargaEventChange extends EventChange {
    public MaquinaRecargaEventChange(MaquinaRecarga maquinaRecarga) {
        apply((Recarga event) -> {
            maquinaRecarga.fecha = event.getFecha();
            maquinaRecarga.tarifa = event.getTarifa();
        });
    }
}
