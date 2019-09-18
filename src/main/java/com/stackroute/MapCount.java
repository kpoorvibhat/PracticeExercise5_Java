package com.stackroute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapCount {

    public Map<String, Integer> countOccurences(String str) {

        //Hashmap to store the frequency of elements
        Map<String, Integer> keyValuePair = new HashMap<String, Integer>();

        //split the string by non alphabetic characters into words
        String[] words = str.split("[^[a-zA-Z]]");

        int count;

        for(int i=0; i<words.length; i++) {
            if (!words[i].equals("")) {
                if (keyValuePair.containsKey(words[i])) {
                    count = keyValuePair.get(words[i]);
                    keyValuePair.put(words[i], count + 1);
                } else {
                    keyValuePair.put(words[i], 1);
                }
            }
        }
        return keyValuePair;
    }
}
