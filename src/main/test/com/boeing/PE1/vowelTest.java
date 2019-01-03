package com.boeing.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class vowelTest {

    vowel Vowel;
    @Before
    public void setUp() throws Exception {
        Vowel = new vowel();
    }

    @After
    public void tearDown() throws Exception {
        Vowel = null;
    }

    @Test
    public void vowel() {
        //Arrange
        String expectedValue="vowel";

        //Act
        String actualValue=Vowel.vowel("i");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void consonant() {
        //Arrange
        String expectedValue="consonant";

        //Act
        String actualValue=Vowel.vowel("A");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}