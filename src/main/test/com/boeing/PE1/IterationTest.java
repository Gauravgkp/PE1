package com.boeing.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest {

    Iteration iteration;
    @Before
    public void setUp() throws Exception {
        iteration = new Iteration();
    }

    @After
    public void tearDown() throws Exception {
        iteration = null;
    }

    @Test
    public void iterationPass(){
        //Arrange
        Boolean expectedValue =true;

        //Act
        Boolean actualValue = iteration.iteration(5);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void iterationFail(){
        //Arrange
        Boolean expectedValue =false;

        //Act
        Boolean actualValue = iteration.iteration(5);

        //Assert
        assertNotEquals(expectedValue, actualValue);
    }
}