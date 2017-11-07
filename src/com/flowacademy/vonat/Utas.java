package com.flowacademy.vonat;

public class Utas extends Ember {

    private int jegyekszama;

    public boolean isBerletes() {
        return berletes;
    }

    private boolean berletes;

    public boolean isErvenyesitett() {
        return ervenyesitett;
    }

    private boolean ervenyesitett;

    public Utas(String nev, int kor, int jegyekszama, boolean berletes) {
        super(nev, kor);
        this.jegyekszama = jegyekszama;
        this.berletes = berletes;
        this.ervenyesitett = false;
    }

    public void felszall() {
        if(berletes == true) {
            System.out.println(getNev() + " felszállt a járműre bérlettel.");
        } else if (jegyekszama > 0) {
            ervenyesitett = true;
            jegyekszama --;
            System.out.println(getNev() + " felszállt a jáműre és lyukasztott egy jegyet.");
        } else {
            System.out.println(getNev() + "felszállt a járműre bár nincs jegye");
        }
    }


    @Override
    public String toString() {
        return
                "Név: " + super.getNev() + '\'' +
                        "; életkor: " + super.getKor() +
                        "jegyekszama: " + jegyekszama +
                        ", berletes: " + berletes +
                        ", ervenyesitett: " + ervenyesitett
                ;
    }
}
