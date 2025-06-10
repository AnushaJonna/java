package com.anu;

import java.util.*;

public class ZooGraph {
    private Map<String, List<String>> graph = new HashMap<>();

    public void addConnection(String from, String to) {
        graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
    }

    public void displayConnections() {
        for (String location : graph.keySet()) {
            System.out.println(location + " connects to: " + graph.get(location));
        }
    }

    public static void main(String[] args) {
        ZooGraph zoo = new ZooGraph();

        
        zoo.addConnection("Entrance", "Reptile House");
        zoo.addConnection("Entrance", "Bird Sanctuary");
        zoo.addConnection("Entrance", "Mammal Zone");

        zoo.addConnection("Reptile House", "Snake Pit");
        zoo.addConnection("Bird Sanctuary", "Parrot Pavilion");
        zoo.addConnection("Mammal Zone", "Lion Den");
        zoo.addConnection("Mammal Zone", "Elephant Enclosure");

        
        zoo.displayConnections();
    }
}