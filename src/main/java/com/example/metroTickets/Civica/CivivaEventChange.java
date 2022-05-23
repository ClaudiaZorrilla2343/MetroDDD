package com.example.metroTickets.Civica;

import co.com.sofka.domain.generic.EventChange;

public class CivivaEventChange extends EventChange {
    public CivivaEventChange(Civica civica) {
    apply((Asignacion event) -> {
        civica.tipoTarjeta = event.getTipoTarjeta();
        civica.usuario = event.getUsuario();
    });
    }
}
