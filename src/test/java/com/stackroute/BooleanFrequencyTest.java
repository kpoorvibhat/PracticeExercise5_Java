package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class BooleanFrequencyTest {
    private static BooleanFrequency booleanFrequency;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        booleanFrequency = new BooleanFrequency();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        booleanFrequency = null;
    }
    @Test
    public void testBooleanFrequency_GivenString_ShouldReturnBoolean() {

        Map<String, Boolean> keyValuePair = new HashMap<String, Boolean>();
        keyValuePair.put("a", true);
        keyValuePair.put("b", false);
        keyValuePair.put("c", true);
        keyValuePair.put("d", false);

        assertEquals(keyValuePair, booleanFrequency.stringBoolean(new String[] {"a","b","c","d","a","c","c"}));

    }
}
