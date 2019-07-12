package com.Stackroute.pe1;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        String str = "";
        String revstr = "";
        int len;

        System.out.println("enter a word");
        Scanner input = new Scanner(System.in);
        str = input.nextLine();

        len = str.length();

        for(int i=len - 1; i >= 0;i--)
        {
            revstr = revstr + str.charAt(i);
        }
        System.out.println("the reverse string is " +revstr);
    }
}
