package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortSet {
    public List<String> sortingSet(HashSet<String> names){

        List<String> list = new ArrayList<String>(names);
        Collections.sort(list);
        return list;
    }
}
