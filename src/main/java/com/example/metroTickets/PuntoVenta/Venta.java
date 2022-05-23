package com.example.metroTickets.PuntoVenta;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.metroTickets.PuntoVenta.ValueObjects.Factura;
import com.example.metroTickets.PuntoVenta.ValueObjects.Fecha;
import com.example.metroTickets.PuntoVenta.ValueObjects.Tarifa;

public class Venta extends DomainEvent {
    private final Fecha fecha;
    private final Tarifa tarifa;
    private final Factura factura;
    public Venta(Tarifa tarifa, Fecha fecha, Factura factura) {
        super("com.example.metroTickets.Venta");
        this.fecha = fecha;
        this.tarifa = tarifa;
        this.factura = factura;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public Factura getFactura() {
        return factura;
    }
}
