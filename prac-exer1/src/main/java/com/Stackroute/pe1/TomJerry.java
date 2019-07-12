package com.Stackroute.pe1;

import java.util.Scanner;

public class TomJerry {
    public static void main (String[] args){

  int num;

    System.out.println("enter a number");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    if(num>20 && num<30){
        if(num%2==0) {
            System.out.println("Tom");
        }
        else{
            System.out.println("Jerry");
        }

        }
      else{
        System.out.println("the number is not in the range of 20 and 30");
    }
    }
}
