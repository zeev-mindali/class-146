package oop.if_examples;

import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("please enter a number:");
        num=input.nextInt();

        if (num>=0){
            System.out.println("Your number is possitive :)");
        }

        /*
            if (expression){
                statment1;
                statment2;
            }
         */



    }
}
