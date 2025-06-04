package xyz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> toys=new Stack<>();
		toys.add("bat");
		toys.add("ball");
		toys.add("car");
		System.out.println(toys.pop());
		System.out.println(toys);
		Queue<String> ice=new LinkedList<>();
		ice.add("maya");
		ice.add("leo");
		ice.add("nina");
		System.out.println(ice.poll());
		System.out.println(ice);
	}

}
