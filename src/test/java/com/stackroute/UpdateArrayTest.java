package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class UpdateArrayTest {
    private static UpdateArray updateArray;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        updateArray = new UpdateArray();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        updateArray = null;
    }
    @Test
    public void testUpdateArray_GivenArrayList_ShouldReturnReplacedArray() {

        List<String> testFruits = new ArrayList<>();
        testFruits.add("Kiwi");
        testFruits.add("Grape");
        testFruits.add("Mango");
        testFruits.add("Berry");

        assertEquals(testFruits, updateArray.updateArrayList());

        testFruits.clear();
    }

    @Test
    public void testRemoveElements_GivenArrayList_ShouldReturnEmptyArrayList() {

        List<String> fruits = new ArrayList<>();

        assertEquals(fruits, updateArray.removeElements());
    }

}
