package com.boeing.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringInputTest {

    StringInput stringInput;
    @Before
    public void setUp() throws Exception {
        stringInput = new StringInput();
    }

    @After
    public void tearDown() throws Exception {
        stringInput = null;
    }

    @Test
    public void addStringPass(){
        //Arrange
        Boolean expectedValue =true;

        //Act
        Boolean actualValue = stringInput.addString(5, "HappyNewYear");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addStringFail(){
        //Arrange
        Boolean expectedValue =false;

        //Act
        Boolean actualValue = stringInput.addString(5, "HappyNewYear");

        //Assert
        assertNotEquals(expectedValue, actualValue);
    }
}