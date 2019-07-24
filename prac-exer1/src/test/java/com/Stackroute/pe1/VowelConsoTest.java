package com.Stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsoTest {

    VowelConso vowelconso;

    @Before
    public void setup() {
        vowelconso = new VowelConso();
    }

    @After
    public void tearDown() {
        vowelconso = null;
    }




    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException() {
        //act
        this.vowelconso.vowelOrConsonantChecker(null);
        
    }

    @Test
    public void givenStringShouldReturnNotALetterValue() {
        //act
        String[] actualResult = this.vowelconso.vowelOrConsonantChecker("3");
        //assert
        assertEquals("its not a letter", actualResult);
    }
    @Test
    public void givenStringShouldReturnAnArrayWithAllPossibleResult() {
        //act
        String actualResult = this.vowelconso.vowelOrConsonantChecker("ag2");
        //assert
        String[] expected = {"Vowel", "Consonant",};
        assertArrayEquals(expected, actualResult);

    }
}
