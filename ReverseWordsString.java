package com.anu;

	public class ReverseWordsString {
	    public static void main(String[] args) {
	        String input = "Hello World";
	        String result = reverseWords(input);
	        System.out.println("Original: " + input);
	        System.out.println("Reversed: " + result);
	    }

	    public static String reverseWords(String sentence) {
	        
	        String[] words = sentence.split(" ");
	        StringBuilder reversedSentence = new StringBuilder();

	        
	        for (String word : words) {
	            reversedSentence.append(new StringBuilder(word).reverse().toString()).append(" ");
	        }

	        
	        return reversedSentence.toString().trim();
	    }
	}


	
