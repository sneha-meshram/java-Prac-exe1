package com.Stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

        TomJerry tomorjerry;

        @Before
        public void setup()
       {
            tomorjerry= new TomJerry();
        }

        @After
          public void tearDown(){
            tomorjerry = null;
        }

        @Test
            public void numberReturnString(){
           //act
            String Result=tomorjerry.checkTomOrJerry(25);
            //assert
            assertEquals("Jerry",Result);
           //act
            Result=tomorjerry.checkTomOrJerry(26);
            //assert
            assertEquals("Tom",Result);
        }


    }
