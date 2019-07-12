package com.Stackroute.pe1;

import java.util.Scanner;

public class RepeatStr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = s.next();

        StringBuilder output = new StringBuilder(input);

        System.out.print("Enter number: ");
        int number = s.nextInt();
        while (number > input.length()) {
            System.out.println("Please enter number less than " + input.length() + ":");
            number = s.nextInt();
        }

        String subString = output.substring(input.length() - number);

        output.append(subString.repeat(number));
        System.out.println(output);

        s.close();
    }
}