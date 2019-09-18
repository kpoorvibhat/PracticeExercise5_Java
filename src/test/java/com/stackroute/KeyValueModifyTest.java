package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class KeyValueModifyTest {
    private static KeyValueModify keyValueModify;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        keyValueModify = new KeyValueModify();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        keyValueModify = null;
    }
    @Test
    public void testKeyValueModify_GivenTwoKeys_ShouldReturnModifiedKeyValuePair() {
        Map<String, String> keyValuePair = new HashMap<String, String>();
        Map<String, String> modifiedMap = new HashMap<>();

        keyValuePair.put("val1", "Java");
        keyValuePair.put("val2", "c++");

        modifiedMap.put("val1", "");
        modifiedMap.put("val2", "Java");

        assertEquals(modifiedMap, keyValueModify.modifyMap(keyValuePair));
        keyValuePair.clear();
        modifiedMap.clear();

        keyValuePair.put("val1", "mars");
        keyValuePair.put("val2", "saturn");
        modifiedMap.put("val1", "");
        modifiedMap.put("val2", "mars");

        assertEquals(modifiedMap,keyValueModify.modifyMap(keyValuePair));
    }
}
