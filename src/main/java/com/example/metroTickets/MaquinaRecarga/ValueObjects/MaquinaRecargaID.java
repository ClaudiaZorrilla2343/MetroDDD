package com.example.metroTickets.MaquinaRecarga.ValueObjects;

import co.com.sofka.domain.generic.Identity;

public class MaquinaRecargaID extends Identity {

   private MaquinaRecargaID(String value) {
       super(value);
   }

   public MaquinaRecargaID(){}

    public static MaquinaRecargaID of(String value) {
       return new MaquinaRecargaID();
    }
}
