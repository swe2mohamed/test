package se.test;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
    /*
    Task 4:
    Exercise: Calculate the Sum of Input Numbers Objective: Write a Java program that continuously
    asks the user to enter numbers until the user enters 0. After 0 is entered,
    the program should print the sum of all entered numbers.
    */
        Scanner scanner = new Scanner(System.in);
        boolean isNotZero = true;
        int result = 0;
        while (isNotZero){
            System.out.print("Enter a number (or 0 to stop): ");
            int num = scanner.nextInt();
            if (num != 0){
                result += num;
            }
            else{
                isNotZero = false;
            }
        }
        System.out.println("Sum of entered numbers: " + result);

    }
}