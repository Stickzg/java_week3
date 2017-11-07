package com.flowacademy.allatok;

public abstract class Szarazfoldi_allat extends Allat {

    private int labakSzama;


    public Szarazfoldi_allat(String nev, int jollakottsag, int ero, int labakSzama) {
        super(nev, jollakottsag, ero);
        this.labakSzama = labakSzama;
    }
}
