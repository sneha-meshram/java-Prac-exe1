package com.Stackroute.pe1;

import java.lang.annotation.Target;

import static org.junit.Assert.*;

public class GuessTheNumberTest {

    GuessTheNumber guessTheNumber;

    @Before
    public void setup() {

        guessTheNumber = new GuessTheNumber();
    }

    @After
    public void tearDown() {
        guessTheNumber = null;
    }

    @Test
    public void givenNumberShouldReturnTheMessage() {
        int temp = 20, temp1 = 32;
        String actualResult = guessTheNumber.gussNumber(temp, temp1);
        String expectedResult = "Number guessed is more than original number";
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void givenNumberShouldReturnTheMesaage() {
        int temp = 28, temp1 = 10;
        String actualResult = guessTheNumber.gussNumber(temp, temp1);
        String expectedResult = "Number guessed is less than original number";
        assertEquals(expectedResult, actualResult);
    }
}
