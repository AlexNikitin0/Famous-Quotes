package com.pluralsight;
import java.util.Scanner;
public class FamousQuotes {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        String[] quotes = new String[10];
        String yn;

        quotes[0] = "Keep it simple stupid!";
        quotes[1] = "All you had to do was follow the damn train CJ!";
        quotes[2] = "there are years where nothing happens, then there are weeks where decades happen.";
        quotes[3] = "It's Clear To See Who Makes The Pants Here.";
        quotes[4] = "Survival Of The Fitness, Boys.";
        quotes[5] = "Supply And Command";
        quotes[6] = "It's Not Rocket Appliances.";
        quotes[7] = "Worst Case Ontario.";
        quotes[8] = "Get Two Birds Stoned At Once";
        quotes[9] = "Looks Like A Tropical Earthquake Blew Through Here.";
do {
    System.out.print("Welcome to the quote generator! Please enter a number 1-10: ");
    choice = keyboard.nextInt();
    try {
        if (choice == 1) {
            System.out.println(quotes[0]);
        } else if (choice == 2) {
            System.out.println(quotes[1]);
        } else if (choice == 3) {
            System.out.println(quotes[2]);
        } else if (choice == 4) {
            System.out.println(quotes[3]);
        } else if (choice == 5) {
            System.out.println(quotes[4]);
        } else if (choice == 6) {
            System.out.println(quotes[5]);
        } else if (choice == 7) {
            System.out.println(quotes[6]);
        } else if (choice == 8) {
            System.out.println(quotes[7]);
        } else if (choice == 9) {
            System.out.println(quotes[8]);
        } else if (choice == 10) {
            System.out.println(quotes[9]);
        } else System.out.println(quotes[choice]);
    } catch (Exception e) {
        System.out.println("your number is out of bounds");
    }

    System.out.println("would you like to select another quote? (Y/N): ");
    System.out.println();
    keyboard.nextLine();
    yn = keyboard.nextLine();
}while (yn.equalsIgnoreCase("y"));

    }
}