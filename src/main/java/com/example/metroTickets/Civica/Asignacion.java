package com.example.metroTickets.Civica;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.metroTickets.Civica.ValueObjects.TipoTarjeta;

public class Asignacion extends DomainEvent {

    private TipoTarjeta tipoTarjeta;
    private Usuario usuario;
    public Asignacion(TipoTarjeta tipoTarjeta, Usuario usuario) {
        super("com.example.metroTickets.Asignacion");
        this.tipoTarjeta = tipoTarjeta;
        this.usuario = usuario;
    }

    public TipoTarjeta getTipoTarjeta() {
        return tipoTarjeta;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
