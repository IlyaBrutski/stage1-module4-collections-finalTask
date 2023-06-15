package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparing(String::length).reversed());
        for(Map.Entry<String, Set<String>> m : projects.entrySet()){
            if(m.getValue().contains(developer)){
                queue.add(m.getKey());
            }
        }
        return new ArrayList<>(queue);
    }
}
