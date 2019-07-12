package com.Stackroute.pe1;

import java.util.Scanner;


public class VowelConso {

    public String Checkcharacter(String input) {

        if ((input != null) && (!input.isEmpty()) && (!input.matches(".\\d."))) {
            char[] inputArray = input.toCharArray();
            for (char c : inputArray) {
                if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
                    System.out.println(c + " is - vowel");
                } else {
                    System.out.println(c + " is - Consonant");
                }
            }
        } else {
            return("Please give a valid string");
        }
        return(input);
    }
}
