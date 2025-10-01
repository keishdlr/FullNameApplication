package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static Scanner nameScanner = new Scanner(System.in);  // Read user input

    public static void main(String[] args) {

        System.out.println("Please enter your name"); // Prompt the user for their first name
        System.out.println("First name: ");
        String firstName = nameScanner.nextLine().trim();

        System.out.println("Middle name: ");
        String middleName = nameScanner.nextLine().trim();

        System.out.println("Last name: ");
        String lastName = nameScanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = nameScanner.nextLine().trim();

        System.out.println("First name: " + firstName + \n "Middle name: " + middleName + \n "Last name: " + lastName + \n  "Suffix: " + suffix);



    }

}
