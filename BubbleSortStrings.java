package com.anu;

	public class BubbleSortStrings {
	    public static void main(String[] args) {
	        String[] names = {"John", "Alice", "Bob", "Charlie", "Eve"};
	        String temp;

	        
	        for (int i = 0; i < names.length - 1; i++) {
	            for (int j = 0; j < names.length - i - 1; j++) {
	                if (names[j].compareTo(names[j + 1]) > 0) {
	                  
	                    temp = names[j];
	                    names[j] = names[j + 1];
	                    names[j + 1] = temp;
	                }
	            }
	        }

	       
	        System.out.println("Sorted names:");
	        for (String name : names) {
	            System.out.println(name);
	        }
	    }
	}
