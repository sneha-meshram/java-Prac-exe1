package com.Stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;
    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside before");
        this.junitDemo = new JunitDemo();
    }
    @After
    public void tearDown(){
        System.out.println("Inside after");
        this.junitDemo=null;
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }

    @Test
    public void givenTwoStringsShouldReturnConcatedUpperString() {
        //act
        String actualResult = junitDemo.concatAndUpperCase("hello", "World");
        assertNotNull(actualResult);
        //assert
        assertEquals("HELLOWORLD", actualResult);
    }

    @Test
    public void givenAStringAndNullShouldReturnErrorMessage() {
       //act
        String actualResult = junitDemo.concatAndUpperCase("hello", null);
        //assert
        assertNotNull("Null value not allowed", actualResult);
        assertEquals("Null value a=not allowed",actualResult);
    }



//    @Test
//    public void givesStringShouldThrownullPointerException() {
//        String actualResult = junitDemo.reverseString(str1:null);
//    }

}
