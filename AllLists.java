package xy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

class MyArrayList {
    public ArrayList<String> getStudentList() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("anu");
        arr.add("siri");
        arr.add("mouni");
        arr.add("jyothi");
        return arr;
    }
}

class MyLinkedList {
    public LinkedList<String> getFruitList() {
        LinkedList<String> li = new LinkedList<>();
        li.add("mango");
        li.add("orange");
        li.add("apple");
        li.add("banana");
        return li;
    }
}

class MyHashSet {
    public HashSet<String> getAnimalList() {
        HashSet<String> hs = new HashSet<>();
        hs.add("dog");
        hs.add("rabbit");
        hs.add("horse");
        hs.add("fox");
        return hs;
    }
}

class MyHashMap {
    public HashMap<String, String> getCountryMap() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("IN", "India");
        hm.put("KR", "Korea");
        hm.put("US", "USA");
        hm.put("EU", "Europe");
        return hm;
    }
}

public class AllLists {
    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();
        MyLinkedList mll = new MyLinkedList();
        MyHashSet mhs = new MyHashSet();
        MyHashMap mhm = new MyHashMap();

        System.out.println("List of students: " + mal.getStudentList());
        System.out.println("List of fruits: " + mll.getFruitList());
        System.out.println("List of animals: " + mhs.getAnimalList());
        System.out.println("List of countries: " + mhm.getCountryMap());
    }
}
