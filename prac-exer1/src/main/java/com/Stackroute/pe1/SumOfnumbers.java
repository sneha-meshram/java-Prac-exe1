package com.Stackroute.pe1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SumOfnumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers");
        int number = 0;
        int sum = 0;
        while (true) {
            try {
                number = s.nextInt();
                sum += number;
                System.out.println("Sum: " + sum);
            } catch (InputMismatchException ime) {
                System.out.println("Please enter integers only");
                break;
            }
        }
        /*Close the scanner*/
        s.close();
    }
}
