package se.test;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
    /*
    Task 2:
    Objective: Write a Java program that performs basic arithmetic operations on two numbers provided by the user.
    The operations include addition, subtraction, multiplication, and division.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum*secondNum));
        if (secondNum != 0){
            System.out.println(firstNum + " / " + secondNum + " = " + ((double)firstNum/secondNum));
        }
        else {
            System.out.println("You can not divide by zero");
        }
    }
}
