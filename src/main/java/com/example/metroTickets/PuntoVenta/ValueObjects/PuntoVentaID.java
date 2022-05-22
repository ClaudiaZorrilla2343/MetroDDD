package com.example.metroTickets.PuntoVenta.ValueObjects;

import co.com.sofka.domain.generic.Identity;

public class PuntoVentaID extends Identity {
    private PuntoVentaID(String valor){
        super(valor);
    }
    public PuntoVentaID(){}

    public static PuntoVentaID of(String valor) {
        return new PuntoVentaID(valor);
    }
}
