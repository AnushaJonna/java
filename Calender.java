package xyz;

import java.util.Scanner;

public class Calender {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String day = sc.nextLine().toLowerCase();

        switch (day) {
            case "monday":
                System.out.println("Let's Learn Python");
                break;

            case "tuesday":
                System.out.println("Let's Learn DBMS");
                break;

            case "wednesday":
                System.out.println("Let's Learn C");
                break;

            case "thursday":
                System.out.println("Let's Learn C++");
                break;

            case "friday":
                System.out.println("Let's Learn Ruby");
                break;

            case "saturday":
                System.out.println("Let's Learn JavaScript");
                break;

            case "sunday":
                System.out.println("Let's Learn Python");
                break;

            default:
                System.out.println("Invalid day entered.");
        }

        sc.close();
    }
}
