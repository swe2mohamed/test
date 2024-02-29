package se.test;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
    /*
    Task 3:
    Exercise: Check Even or Odd
    Objective: Write a Java program that asks the user to enter a number and then prints whether the number
    is even or odd.
    */
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    if (num % 2 == 0){
        System.out.println(num + " is even.");
    }
    else {
        System.out.println(num + " is odd.");
    }
    }
}