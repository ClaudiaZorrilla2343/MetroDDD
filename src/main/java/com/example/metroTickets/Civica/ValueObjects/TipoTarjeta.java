package com.example.metroTickets.Civica.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class TipoTarjeta implements ValueObject<TipoTarjeta.Tarjeta> {

    private final Tarjeta tipo;

    public TipoTarjeta( Tarjeta tipo) {
        this.tipo = tipo;
    }

    @Override
    public Tarjeta value() {
        return tipo;
    }

    public enum Tarjeta {
        Personal,
        Estudiantil,
        AdultoMayor
    }

}
