package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 1: print your name 5 times using a while or for loop
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String userInput = scan.nextLine();
        System.out.println("Hello " + userInput + "!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Your name is: " + userInput);
        }

        //Task 2: create a method which checks if a number is bigger than zero
        System.out.println();
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        boolean result = numbersBiggerThanZero(num);
        if (result) {
            System.out.println("Your number is bigger than zero");
        } else {
            System.out.println("Your number is smaller than zero or is equal to zero");
        }

        //Task 3: create a method which calculates the square of a number
        System.out.println();
        System.out.println("Enter another number:");
        int number = scan.nextInt();
        System.out.println("The square of " + number + " is: " + squareOfANumber(number));

    }

    public static boolean numbersBiggerThanZero(int number) {
        return number > 0;
    }

    public static int squareOfANumber(int number) {
        return number * number;
    }
}