package com.boeing.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;
    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        palindrome = null;
    }

    @Test
    public void palindrome() {
        //Arrange
        Boolean expectedValue =false;

        //Act
        Boolean actualValue = palindrome.palindrome(1221);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void sum() {
        //Arrange
        int expectedValue = 4;

        //Act
        int actualValue = palindrome.sum (1221);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}