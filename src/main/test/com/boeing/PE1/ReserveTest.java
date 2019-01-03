package com.boeing.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReserveTest {

    Reserve reserve;
    @Before
    public void setUp() throws Exception {
        reserve = new Reserve();
    }

    @After
    public void tearDown() throws Exception {
        reserve = null;
    }

    @Test
    public void ReversePass() {
        //Arrange
        String expectedValue="nodnol";

        //Act
        String actualValue= reserve.reverse("london");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void ReverseFail() {
        //Arrange
        String expectedValue="london";

        //Act
        String actualValue= reserve.reverse("london");
        //Assert
        assertNotEquals(expectedValue, actualValue);
    }
}