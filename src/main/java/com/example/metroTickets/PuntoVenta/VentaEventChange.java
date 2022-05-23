package com.example.metroTickets.PuntoVenta;

import co.com.sofka.domain.generic.EventChange;
import com.example.metroTickets.PuntoVenta.Events.Venta;

public class VentaEventChange extends EventChange {
    public VentaEventChange(PuntoVenta puntoVenta) {
        apply((Venta event) -> {
            puntoVenta.fecha = event.getFecha();
            puntoVenta.tarifa = event.getTarifa();
        });
    }
}
