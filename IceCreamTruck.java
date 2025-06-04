package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class IceCreamTruck {

	public static void main(String[] args) {
	Queue<String> kidsline = new LinkedList<String>();
	kidsline.add("child 1");
	kidsline.add("child 2");
	kidsline.add("child 3");
	System.out.println(kidsline);
	while(!kidsline.isEmpty()) {
		String currentKid = kidsline.poll();
		System.out.println(currentKid + "got their ice cream");
	}
	
	

	}

}
