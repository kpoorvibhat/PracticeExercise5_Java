package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;

public class SortSetTest {
    private static SortSet sortSet;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        sortSet = new SortSet();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        sortSet = null;
    }
    @Test
    public void testSortSet_GivenSet_ShouldReturnSortedList() {

            HashSet<String> set = new HashSet<String>();
            set.add("Harry");
            set.add("Olive");
            set.add("Alice");
            set.add("Bluto");
            set.add("Eugene");

            List<String> sortset = new ArrayList<String>();
            sortset.add("Alice");
            sortset.add("Bluto");
            sortset.add("Eugene");
            sortset.add("Harry");
            sortset.add("Olive");

            assertEquals(sortset, sortSet.sortingSet(set));
    }
}
