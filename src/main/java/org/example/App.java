/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double amount, tax =0;
        String userInput,state, county;

        System.out.print("What is the order amount? ");
        userInput = input.nextLine();
        amount = Double.parseDouble(userInput);

        System.out.print("What state do you live in? ");
        state = input.nextLine();



        if(state.compareTo("Wisconsin") == 0) {
            tax += .05;
            System.out.print("What county do you live in? ");
            county = input.nextLine();
            if(county.compareTo("Eau Claire") == 0)
                tax += 0.005;
            else if(county.compareTo("Dunn") == 0)
                tax += 0.004;
        }

        else if(state.compareTo("Illinois") == 0) {
            tax += 0.08;
        }

        System.out.printf("The tax is $%.2f.", tax * amount);
        System.out.printf("\nThe total is $%.2f", (tax * amount) + amount);
    }
}
