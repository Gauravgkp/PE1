package com.boeing.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharTest {

    Char charCase ;
    @Before
    public void setUp() throws Exception {
        System.out.println("Inside setup");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Inside teardown");
        charCase=null;
    }

    @Test
    public void charCase1() {
        //Arrange
        String expectedValue=" is a Small Alphabet ";

        //Act
        String actualValue=charCase.charCase('a');
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charCase2() {
        //Arrange
        String expectedValue=" is a Capital Alphabet ";

        //Act
        String actualValue=charCase.charCase('A');
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charCase3() {
        //Arrange
        String expectedValue=" is a Special Character ";

        //Act
        String actualValue=charCase.charCase('@');
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charCase4() {
        //Arrange
        String expectedValue=" is a Digit ";

        //Act
        String actualValue=charCase.charCase('1');
        //Assert
        assertEquals(expectedValue, actualValue);
    }


}