package com.anu;


	public class Reverse {

		public static void main(String[] args) {
			String original = "SIREESHA";
			String reversed = new StringBuilder(original).reverse().toString();
			System.out.println(original);
			System.out.println(reversed);
		}
	}
