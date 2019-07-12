package com.Stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

ReverseString reverseString;

@Before
    public void setup()
   {
    reverseString= new ReverseString();
   }
@After
    public void tearDown()
   {
    reverseString= null;
   }

   @Test
           public void reverseString() {
       //act
       String Result = reverseString.CheckStringIsReverse("london");
       //assert
       assertEquals("nodnol", Result);
   }
}