package com.example.metroTickets.Civica;

import co.com.sofka.domain.generic.Entity;
import com.example.metroTickets.Civica.ValueObjects.Apellidos;
import com.example.metroTickets.Civica.ValueObjects.Nombre;
import com.example.metroTickets.Civica.ValueObjects.UsuarioID;

public class Usuario extends Entity<UsuarioID> {

    private Nombre nombre;
    private Apellidos apellidos;

    public Usuario(UsuarioID entityid, Nombre nombre, Apellidos apellidos) {
        super(entityid);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

}
