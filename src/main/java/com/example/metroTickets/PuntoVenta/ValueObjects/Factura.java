package com.example.metroTickets.PuntoVenta.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Factura implements ValueObject<String> {

    private Tarifa tarifa;
    private Fecha fecha;

    public Factura(Tarifa tarifa, Fecha fecha) {
        this.tarifa = tarifa;
        this.fecha = fecha;
    }

    @Override
    public String value() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Factura{" +
                "tarifa=" + tarifa +
                ", fecha=" + fecha +
                '}';
    }

}
