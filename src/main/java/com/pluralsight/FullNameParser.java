package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        String[] namedParts = fullName.split("\\s+");

        if (namedParts.length == 3) {

        } else if (namedParts.length == 2) {

        }

        System.out.println("First name: " + namedParts[0]);
        System.out.println("Middle name: " + namedParts[1]);
        System.out.println("Last name: " + namedParts[2]);




    }

}
