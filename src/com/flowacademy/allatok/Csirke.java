package com.flowacademy.allatok;

public class Csirke extends Szarazfoldi_allat implements Novenyevo {


    public Csirke(String nev, int jollakottsag, int ero) {
        super(nev, jollakottsag, ero, 2);
    }

    @Override
    public String hangotAd() {
        return "Csip, csip!";
    }

    @Override
    public void eszik() {
        System.out.println("Magokat eszik.");
    }

    @Override
    public void pihen() {
        System.out.println("Éjelente.");
    }

}
