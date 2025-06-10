package com.anu;

import java.util.*;

public class SocialNetwork {
    private Map<String, List<String>> network;

    public SocialNetwork() {
        network = new HashMap<>();
    }

    
    public void addPerson(String name) {
        if (!network.containsKey(name)) {
            network.put(name, new ArrayList<>());
        } else {
            System.out.println(name + " already exists in the network.");
        }
    }

    
    public void addFriendship(String person1, String person2) {
        if (!network.containsKey(person1) || !network.containsKey(person2)) {
            System.out.println("Both people must exist in the network.");
            return;
        }

        if (!network.get(person1).contains(person2)) {
            network.get(person1).add(person2);
        }

        if (!network.get(person2).contains(person1)) {
            network.get(person2).add(person1);
        }
    }

    
    public void displayNetwork() {
        for (String person : network.keySet()) {
            System.out.println(person + " -> " + network.get(person));
        }
    }

    
    public List<String> getFriends(String person) {
        return network.getOrDefault(person, new ArrayList<>());
    }

    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        sn.addPerson("Alice");
        sn.addPerson("Bob");
        sn.addPerson("Charlie");

        sn.addFriendship("Alice", "Bob");
        sn.addFriendship("Alice", "Charlie");

        System.out.println("\nSocial Network:");
        sn.displayNetwork();

        System.out.println("\nFriends of Alice: " + sn.getFriends("Alice"));
    }
}

