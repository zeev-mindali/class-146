package oop.class_1_first_java;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        //creating an object to get input
        Scanner input = new Scanner(System.in);

        //write a message to the client
        System.out.println("Please enter a number:");
        //get the input from client
        int myNumber = input.nextInt();
        //print the input to the screen
        System.out.println("your number is:"+myNumber);
    }
}
