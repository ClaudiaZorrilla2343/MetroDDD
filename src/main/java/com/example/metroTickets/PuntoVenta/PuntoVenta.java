package com.example.metroTickets.PuntoVenta;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.metroTickets.PuntoVenta.ValueObjects.Factura;
import com.example.metroTickets.PuntoVenta.ValueObjects.Fecha;
import com.example.metroTickets.PuntoVenta.ValueObjects.PuntoVentaID;
import com.example.metroTickets.PuntoVenta.ValueObjects.Tarifa;

import java.util.List;

public class PuntoVenta extends AggregateEvent<PuntoVentaID> {

    protected List<Empleado> empleados;
    private Factura factura;
    private Tarifa tarifa;
    private Fecha fecha;

    public PuntoVenta(PuntoVentaID puntoVentaID, Factura factura, Tarifa tarifa, Fecha fecha) {
        super(puntoVentaID);
        appendChange(new Venta(tarifa, fecha, factura)).apply();
        //subscribe(new PuntoVenta(this));

    }

    public Factura factura() {
        return factura;
    }
}
