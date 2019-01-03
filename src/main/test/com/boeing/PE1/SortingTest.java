package com.boeing.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    Sorting sorting;
    @Before
    public void setUp() throws Exception {
        sorting = new Sorting();
    }

    @After
    public void tearDown() throws Exception {
        sorting = null;
    }

    @Test
    public void bubbleSort() {

        //Arrange
        boolean expectedValue=true;
        int arrayNum [] = {12,13,15,20,21};

        //Act
        boolean actualValue= sorting.bubbleSort(arrayNum);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void bubbleSortFail() {

        //Arrange
        boolean expectedValue=false;
        int arrayNum [] = {2,3,4,5};

        //Act
        boolean actualValue= sorting.bubbleSort(arrayNum);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}