/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class tax {
    public static void wisconsin(double amount) {
        Scanner in = new Scanner(System.in);
        double tax = 5;
        System.out.print("What county do you live in? ");
        String county = in.nextLine().trim().toLowerCase();
        switch (county) {
            case "eau claire":
                tax += 0.5;
                System.out.printf("The tax is $%.2f%nThe total is $%.2f", tax * amount / 100, (tax * amount / 100) + amount);
            case "dunn":
                tax += 0.4;
                System.out.printf("The tax is $%.2f%nThe total is $%.2f", tax * amount / 100, (tax * amount / 100) + amount);
            default:
                System.out.printf("The tax is $%.2f%nThe total is $%.2f", tax * amount / 100, (tax * amount / 100) + amount);
        }
    }

    public static void illinois(double amount) {
        double tax = 8;
        System.out.printf("The tax is $%.2f%nThe total is $%.2f", tax * amount / 100, (tax * amount / 100) + amount);
    }
}
