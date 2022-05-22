package com.example.metroTickets.PuntoVenta;

import co.com.sofka.domain.generic.Entity;
import com.example.metroTickets.PuntoVenta.ValueObjects.Apellidos;
import com.example.metroTickets.PuntoVenta.ValueObjects.EmpleadoID;
import com.example.metroTickets.PuntoVenta.ValueObjects.Nombre;

public class Empleado extends Entity<EmpleadoID> {

    private Nombre nombre;
    private Apellidos apellidos;

    public Empleado(EmpleadoID empleadoID, Nombre nombre, Apellidos apellidos){
       super(empleadoID);
       this.nombre = nombre;
       this.apellidos = apellidos;
    }

}
