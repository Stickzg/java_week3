package com.flowacademy.allatok;

public class Macska extends Allat {


    public Macska(String nev, int jollakottsag, int ero) {
        super(nev, jollakottsag, ero);
    }

    @Override
    public String hangotAd() {
        return  "Miau, miau!";
    }
}
