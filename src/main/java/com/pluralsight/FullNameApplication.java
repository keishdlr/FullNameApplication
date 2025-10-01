package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static Scanner nameScanner = new Scanner(System.in);  // Read user input

    public static void main(String[] args) {

        System.out.println("Please enter your name");
        System.out.print("First name: "); // Prompt the user for their first name
        String firstName = nameScanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = nameScanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = nameScanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = nameScanner.nextLine().trim();

        String fullName =  firstName;

        if (!middleName.trim().isEmpty()) {
            fullName += " " + middleName + " ";
        }
            fullName += lastName;

        if (!suffix.trim().isEmpty()) {
            fullName += " " + suffix;
        }
    }

}
