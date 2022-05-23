package com.example.metroTickets.Civica.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Scanner;

import static java.lang.System.in;

public class TipoTarjeta implements ValueObject<TipoTarjeta.Tarjeta> {

    Scanner leer = new Scanner(in);
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

    public void elegirTipoTarjeta() {
        Tarjeta[] tipo = Tarjeta.values();
        for (int i = 0; i < tipo.length; i ++) {
            System.out.println((i) + ")" + tipo[i]);
        }
        System.out.println("Seleccione el tipo de tarjeta a recargar: ");
        Integer eleccionTarjeta = leer.nextInt();
        System.out.println(tipo[eleccionTarjeta]);
    }

}
