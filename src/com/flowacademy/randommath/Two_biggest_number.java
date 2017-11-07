package com.flowacademy.randommath;

import java.util.Random;

public class Two_biggest_number {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0 ; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        int max = array[0];
        int secondMax = array [0];

        for (int i = 0 ; i < array.length; i++) {
            if (array[i] > max ) {
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
