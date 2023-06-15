package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (Map.Entry<String, Integer> m : sourceMap.entrySet()){
            if(map.containsKey(m.getKey().length())){
                map.get(m.getKey().length()).add(m.getKey());
            } else {
                Set<String> set = new HashSet<>();
                set.add(m.getKey());
                map.put(m.getKey().length(), set);
            }

        }
        return map;
    }
}
