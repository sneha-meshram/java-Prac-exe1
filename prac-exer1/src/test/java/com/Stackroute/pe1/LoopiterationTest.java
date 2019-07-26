package com.Stackroute.pe1;

import java.beans.BeanProperty;

import static org.junit.Assert.*;

public class LoopiterationTest {

    Loopiteration loopiteration;

    @Before
    public void setup(){
        loopiteration=new Loopiteration();
    }
    @After
    public void tearDown(){
        loopiteration=null;
    }
    @Test
    public void givenNumberShouldReturnIteration(){
        //act
        int[] actualResult =loopiteration.iterate(5);
        int expectedResult[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        //assert
        assertArrayEquals(expectedResult,actualResult);
    }

}