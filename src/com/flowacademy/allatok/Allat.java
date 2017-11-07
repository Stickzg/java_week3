package com.flowacademy.allatok;

public abstract class Allat {

    private String nev;
    protected int jollakottsag;
    private int ero;


    public Allat(String nev, int jollakottsag, int ero) {
        this.nev = nev;
        this.jollakottsag = 100;
        this.ero = 0;
    }

    public abstract String hangotAd();

    public String getNev() {
        return nev;
    }

    public int getJollakottsag() {
        return jollakottsag;
    }

    public int getEro() {
        return ero;
    }
}
