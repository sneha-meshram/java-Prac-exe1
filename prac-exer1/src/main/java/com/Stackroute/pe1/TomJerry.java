package com.Stackroute.pe1;

import java.util.Scanner;

public class TomJerry {
    public String checkTomOrJerry (int num){

/*
    System.out.println("enter a number");
    Scanner scanner = new Scanner(System.in);
    num = scanner.nextInt();
*/
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
