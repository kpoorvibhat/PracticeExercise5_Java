package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class BooleanFrequency {
    public Map<String, Boolean> stringBoolean(String[] inputString){

        //Hashmap to store the frequency of elements
        Map<String, Boolean> keyValuePair = new HashMap<String, Boolean>();

        for(int i=0; i<inputString.length; i++)
        {
            if (keyValuePair.containsKey(inputString[i])) {
                keyValuePair.put(inputString[i], true);
            } else {
                keyValuePair.put(inputString[i], false);
            }
        }

        return keyValuePair;
    }
}
