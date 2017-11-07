package com.flowacademy.vonat;

public class Ellenőr extends Ember {

    private int megbuntetettUtasok;

    public Ellenőr(String nev, int kor) {
        super(nev, kor);
        this.megbuntetettUtasok = 0;
    }

    public int getMegbuntetettUtasok() {
        return megbuntetettUtasok;
    }

    public void setMegbuntetettUtasok(int megbuntetettUtasok) {
        this.megbuntetettUtasok = megbuntetettUtasok;
    }

    public void ellenoriz(Utas utas) {
        if (utas.isBerletes() == true || utas.isErvenyesitett() == true ) {
            System.out.println(utas.getNev() + "-nél minden rendben volt.");
        } else if (utas.isErvenyesitett() == false) {
            System.out.println(utas.getNev().toString() + "-t Megbüntette 5000 Ft-ra.");
            megbuntetettUtasok ++;
        }
    }

    @Override
        public String toString() {
            return
                    "Név: " + super.getNev() + '\'' +
                            " életkor: " + super.getKor() +
                            " megbüntetett utasok: " + megbuntetettUtasok
                    ;
        }
}
