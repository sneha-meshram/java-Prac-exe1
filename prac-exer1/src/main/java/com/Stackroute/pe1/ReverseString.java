package com.Stackroute.pe1;

import java.util.Scanner;

public class ReverseString {

    public String CheckStringIsReverse(String str) {

      /*  String str = ""; */
        String revstr = "";
        int len;

        //
        // System.out.println("enter a word");
        // Scanner input = new Scanner(System.in);
        // str = input.nextLine();
        //
        len = str.length();

        for(int i=len - 1; i >= 0;i--)
        {
            revstr = revstr + str.charAt(i);
        }
        return(revstr);
    }
}
