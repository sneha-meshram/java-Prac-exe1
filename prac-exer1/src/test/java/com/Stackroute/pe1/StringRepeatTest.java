package com.Stackroute.pe1;

import static org.junit.Assert.*;

public class StringRepeatTest {

    StringRepeat stringRepeat;

    @Before
    public void setUp() throws Exception {
        stringRepeat = new StringRepeat();
    }

    @After
    public void tearDown() throws Exception {
        stringRepeat = null;
    }

    @Test
    public void givenStringAndNumberShouldReturnStringWithRepeatedSubString() {
        assertEquals("snehahaha",
                stringRepeat.repeat("sneha", 2));
        assertEquals("javaavaavaava",
                stringRepeat.repeat("java",3));
    }

}