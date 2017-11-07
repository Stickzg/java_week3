package com.flowacademy.vonat;

public class Ember {
    private String nev;
    private int kor;

    public Ember(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }




    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }



    @Override
    public String toString() {
        return
                "Név: " + nev + '\'' +
                "; életkor: " + kor
                ;
    }

}
