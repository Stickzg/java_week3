package com.flowacademy.randommath;

import java.util.Random;

public class Bigger_random {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(100);
        int b = random.nextInt(100);

        if ( a > b) {
            System.out.println(a-b);
        } else if (b > a) {
            System.out.println(b-a);
        }
    }
}
