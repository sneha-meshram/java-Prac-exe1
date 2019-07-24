package com.Stackroute.pe1;

import java.util.Scanner;

public class ReverseString {

    public String CheckStringIsReverse(String str) {

      /*  String str = ""; */
        String revstr = "";
        int len;

        len = str.length();

        for(int i=len - 1; i >= 0;i--)
        {
            revstr = revstr + str.charAt(i);
        }
        return(revstr);
    }
}
