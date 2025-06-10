package com.anu;
import java.util.*;

public class SocialCircle {

    
    static void dfsRec(String p, Map<String, List<String>> g, Set<String> v, List<String> res) {
        v.add(p); res.add(p);
        for (String n : g.getOrDefault(p, List.of()))
            if (!v.contains(n)) dfsRec(n, g, v, res);
    }

    static List<String> circleRec(String start, Map<String, List<String>> g) {
        Set<String> v = new HashSet<>(); List<String> res = new ArrayList<>();
        dfsRec(start, g, v, res); return res;
    }

  
    static List<String> circleIter(String start, Map<String, List<String>> g) {
        Set<String> v = new HashSet<>(); List<String> res = new ArrayList<>();
        Stack<String> s = new Stack<>(); s.push(start);
        while (!s.isEmpty()) {
            String p = s.pop();
            if (v.add(p)) {
                res.add(p);
                for (String n : g.getOrDefault(p, List.of())) s.push(n);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Map<String, List<String>> g = new HashMap<>();
        g.put("A", List.of("B", "C")); g.put("B", List.of("A"));
        g.put("C", List.of("A")); g.put("D", List.of("E"));
        g.put("E", List.of("D")); g.put("F", List.of());

        System.out.println("Rec A: " + circleRec("A", g));
        System.out.println("Iter A: " + circleIter("A", g));
        System.out.println("Rec D: " + circleRec("D", g));
        System.out.println("Iter D: " + circleIter("D", g));
        System.out.println("Rec F: " + circleRec("F", g));
        System.out.println("Iter F: " + circleIter("F", g));
    }
}