package com.anu;
import java.util.*;


public class SortStrings {
    

	public static void main(String[] args) {
	   String[] names= {"Anu","Siri","Mouni","veena","liki"};
	   
		
		Arrays.sort(names);
		
		System.out.println("Sorted names:");
		for(String name:names) {
			System.out.println(name);
		}
		

	}

}
