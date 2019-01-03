package com.boeing.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTest {

    Guess guess;
    @Before
    public void setUp() throws Exception {
        System.out.println("Inside setup");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Inside teardown");
        guess = null;
    }

    @Test
    public void guess3() {
        //Arrange
        boolean expectedValue=true;

        //Act
        boolean actualValue=guess.guess(34, 40);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void guess1() {
        //Arrange
        boolean expectedValue=true;

        //Act
        boolean actualValue=guess.guess(44, 40);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void guess2() {
        //Arrange
        boolean expectedValue=false;

        //Act
        boolean actualValue=guess.guess(40, 40);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}