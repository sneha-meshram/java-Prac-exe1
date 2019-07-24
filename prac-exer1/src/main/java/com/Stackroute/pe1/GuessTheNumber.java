package com.Stackroute.pe1;

import java.util.Random;
import java.util.Scanner;

/**
 * Practice Exercise Question - 8
 * Class accepts a number from user as input (set the limit say 1 - 50 or 1 -
 * 100) User should guess until the the target number is guessed correctly.
 */

public class GuessTheNumber {

    public String gussNumber(int n, int m){

        if (n >= 1 && n <= 50) {
            if (m > n)
                return  ("Number guessed is more than original number");
            else if (m < n)
                return  ("Number guessed is less than original number");
            else
                return ("Number guessed matches the original number");
        }
        if(n==0 && m==0){
            return ("null value not allowed");
        }
        return null;
    }
}


