package com.boeing.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

    TomJerry tomJerry;
    @Before
    public void setUp() throws Exception {
        tomJerry = new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
        tomJerry = null;
    }

    @Test
    public void odd() {
        //Arrange
        String expectedValue ="Tom";

        //Act
        String actualValue = tomJerry.oddEven(25);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void even() {
        //Arrange
        String expectedValue ="Jerry";

        //Act
        String actualValue = tomJerry.oddEven(22);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}