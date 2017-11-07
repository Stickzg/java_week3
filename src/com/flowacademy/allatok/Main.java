package com.flowacademy.allatok;

public class Main {

    public static void main(String[] args) {

    Allat[] allatok = new Allat[5];

    Macska cili = new Macska("Cili", 100, 0);
    Macska grumpy = new Macska("Grumpy", 100, 0);
    Macska kormos = new Macska("Kormos", 100, 0);
    Kutya maszat = new Kutya("Maszat", 100, 5);
    Kutya tedi = new Kutya("Tedi", 100, 6);

    allatok[0] = cili;
    allatok[1] = grumpy;
    allatok[2] = kormos;
    allatok[3] = maszat;
    allatok[4] = tedi;


    for ( int i = 0; i < allatok.length; i++) {
        System.out.println(allatok[i].getNev() + allatok[i].hangotAd());
    }

    for (int i = 0; i < allatok.length; i++) {
        if (allatok[i] instanceof Macska) {
            maszat.eszik(allatok[i]);
        }
    }
    for (int i = 0; i < allatok.length; i++) {
        System.out.println(allatok[i].getClass());
    }

        for (Allat allat: allatok) {
            System.out.println(allat.getClass());
        }

    }
}
