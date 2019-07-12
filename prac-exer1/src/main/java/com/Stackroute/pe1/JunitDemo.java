package com.Stackroute.pe1;

public class JunitDemo {

    public String concatAndUpperCase(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return ("Null value not allowed");
        }
        String concattedString = str1.concat(str2);
        return concattedString.toUpperCase();
    }

}
