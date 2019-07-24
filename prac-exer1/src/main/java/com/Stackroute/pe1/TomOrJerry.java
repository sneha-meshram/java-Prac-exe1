package com.Stackroute.pe1;

import java.util.Scanner;


/*
 * Class accepts an integer number as input from the user and perform the
 * following conditional checks:
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */


public class TomOrJerry {
    public String checkTomOrJerry (int num){

    if(num>20 && num<30){
        if(num%2==0) {
            return("Tom");
        }
        else{
            return("Jerry");
        }

        }
      else{
        return ("the number is not in the range of 20 and 30");
    }
    }
}
