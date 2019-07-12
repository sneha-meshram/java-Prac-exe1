package com.Stackroute.pe1;

import java.util.Scanner;


public class Palindrome {

    public String palindromeSum(long inputNum) {
        String returnResult = "Not a palindrome";
        if (isPalindrome(inputNum)) {
            if ((isSumOfEvenNum(inputNum) > 25)) {
                returnResult = "Palindrome and greater than 25";
            } else {
                returnResult = "Palindrome and lesser than 25";
            }
        }
        return returnResult;
    }

    private boolean isPalindrome(long number) {
        String str = "";
        String stringNum = String.valueOf(number);
        boolean boo = false;
        for (int i = stringNum.length() - 1; i >= 0; i--) {
            str = str.concat(String.valueOf(stringNum.charAt(i)));
        }
        if (str.equals(stringNum)) boo = true;
        return boo;
    }

    private int isSumOfEvenNum(long number) {
        int sumOfEvenNum = 0;
        long localNumber = number;
        while (localNumber > 0) {
            if ((localNumber % 10) % 2 == 0) {
                sumOfEvenNum += localNumber % 10;
            }
            localNumber = localNumber / 10;
        }
        return sumOfEvenNum;
    }
}