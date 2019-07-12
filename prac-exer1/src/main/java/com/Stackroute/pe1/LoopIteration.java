package com.Stackroute.pe1;

import java.util.Scanner;

public class LoopIteration {


    public static void main(String[] args) {
        int num;

        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(+i);
            }
        }

    }
}
