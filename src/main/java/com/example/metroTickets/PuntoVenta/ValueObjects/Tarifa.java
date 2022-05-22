package com.example.metroTickets.PuntoVenta.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Tarifa implements ValueObject<Double> {
    private Double tarifa;

    public Tarifa(Double  tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public Double value() {
        return this.tarifa;
    }

}
