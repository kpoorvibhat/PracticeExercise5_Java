package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class KeyValueModify {
    public Map<String, String> modifyMap(Map<String, String> inputMap) {

        String key = inputMap.get("val1");
        inputMap.put("val1", "");
        inputMap.put("val2", key);
        return inputMap;
    }
}
