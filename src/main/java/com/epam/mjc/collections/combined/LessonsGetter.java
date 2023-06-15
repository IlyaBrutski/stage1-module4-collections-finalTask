package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> set = new HashSet<>();
        for (Map.Entry<String, List<String>> m : timetable.entrySet()){
            for(String s : m.getValue()){
                if(!set.contains(s))
                    set.add(s);
            }
        }
        return set;
    }
}
