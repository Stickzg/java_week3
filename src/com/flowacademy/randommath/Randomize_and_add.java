package com.flowacademy.randommath;

import java.util.Random;

public class Randomize_and_add {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(10)+10;
        int b = random.nextInt(10)+10;
        System.out.println("A két generált szám: " + a + " " + b);
        System.out.println("Öszzegük : " + (a+b));
        System.out.println("Szorzatuk: " + a*b);
    }
}
