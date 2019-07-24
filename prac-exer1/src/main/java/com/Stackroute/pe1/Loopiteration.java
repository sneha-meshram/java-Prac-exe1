package com.Stackroute.pe1;

import java.util.Scanner;

public class Loopiteration {

    public int[] iterate(int inputNumber) {
        int index = 0;
        int size = 0;
        for (int i = 1; i <= inputNumber; i++) {
            size += i;
        }
        int[] arrayiterate = new int[size];
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 1; j <= i; j++) {
                arrayiterate[index] = i;
                index++;
            }
        }
        return arrayiterate;
    }
}




