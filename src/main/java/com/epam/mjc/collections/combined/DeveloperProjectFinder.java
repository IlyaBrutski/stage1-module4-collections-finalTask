package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparing(String::length).reversed());
        for(Map.Entry<String, Set<String>> m : projects.entrySet()){
            if(m.getValue().contains(developer)){
                queue.add(m.getKey());
            }
        }
        PriorityQueue<String> queue_2 = new PriorityQueue<>(Comparator.comparing(String::toString).reversed());
        queue_2.addAll(queue);
        for(String s : queue){
            list.add(s);
        }
        return list;
    }
}
