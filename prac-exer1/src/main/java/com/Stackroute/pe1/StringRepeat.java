package com.Stackroute.pe1;

public class StringRepeat {

    public String repeat(String input, int num)  {
        //string builder is used to change the string

        StringBuilder RepeatString = new StringBuilder(input);

        String subString = RepeatString.substring(input.length() - num);
        for (int i = 0; i < num; i++) {
            RepeatString.append(subString);
        }

        return (RepeatString.toString());

    }
}

