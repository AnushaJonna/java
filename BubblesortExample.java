package com.anu;
public class BubblesortExample {
    public static void main(String[] args) {
        int[] candies = {5, 3, 8, 4, 2};

    
        for (int i = 0; i < candies.length - 1; i++) {
            for (int j = 0; j < candies.length - 1 - i; j++) {
                if (candies[j] > candies[j + 1]) {
                    
                    int temp = candies[j];
                    candies[j] = candies[j + 1];
                    candies[j + 1] = temp;
                }
            }
        }

        
        System.out.print("Sorted array: ");
        for (int candy : candies) {
            System.out.print(candy + " ");
        }
    }
}

		


