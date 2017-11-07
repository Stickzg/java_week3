package com.flowacademy.allatok;


import java.util.Random;

public class Kutya extends Szarazfoldi_allat implements Ragadozo {


    public Kutya(String nev, int jollakottsag, int ero) {
        super(nev, jollakottsag, ero, 2);
    }

    @Override
    public void eszik(Allat allat) {
        this.jollakottsag += 10;
    }

    @Override
    public void pihen() {

    }

    @Override
    public String hangotAd() {
        return "vau vau!";
    }
}
