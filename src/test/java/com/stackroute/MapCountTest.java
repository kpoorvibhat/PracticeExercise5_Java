package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class MapCountTest {
    private static MapCount mapCount;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        mapCount = new MapCount();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        mapCount = null;
    }
    @Test
    public void testMapCount_GivenString_ShouldReturnKeyValuePair() {
        Map<String, Integer> keyValuePair = new HashMap<String, Integer>();
        keyValuePair.put("one", 5);
        keyValuePair.put("two", 2);
        keyValuePair.put("three", 2);

        assertEquals(keyValuePair, mapCount.countOccurences("one one -one___two,,three,one @three*one?two"));

    }
}
