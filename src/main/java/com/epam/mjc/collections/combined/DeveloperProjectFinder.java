package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Map<Integer, Queue<String>> map = new HashMap<>();

        for(Map.Entry<String, Set<String>> m : projects.entrySet()){
            if(m.getValue().contains(developer)){
                if(map.containsKey(m.getKey().length())) {
                    map.get(m.getKey().length()).add(m.getKey());
                } else {
                    PriorityQueue<String> q = new PriorityQueue<>(Comparator.comparing(String::toString).reversed());
                    q.add(m.getKey());
                    map.put(m.getKey().length(), q);
                }
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(Map.Entry<Integer, Queue<String>> m : map.entrySet()){
            queue.add(m.getKey());
        }
        List<String> list = new ArrayList<>();
        for(Integer i : queue){
            list.addAll(map.get(i));
        }
        return list;
    }
}
