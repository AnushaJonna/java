package xyz;

import java.util.Scanner;

public class RainUmbrella {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean isRaining = sc.nextBoolean();
		if(isRaining) {
			System.out.println("Take an Umbrella");
		}else {
			System.out.println("no need of Umbrella");
		}

	}
    //true
	//sc.close();
}
