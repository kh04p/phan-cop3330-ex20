/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();
        input.nextLine(); //consumes newline char
        System.out.print("What state do you live in? ");
        String state = input.nextLine();
        switch (state) {
            case "wisconsin":
                tax.wisconsin(amount);
                break;
            case "illinois":
                tax.illinois(amount);
                break;
            default:
                System.out.printf("Your total is $%.2f", amount);
        }
    }
}
