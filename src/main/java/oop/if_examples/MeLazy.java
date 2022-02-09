package oop.if_examples;

import java.util.Scanner;

public class MeLazy {
    public static void main(String[] args) {
        //get a number and return absoulte number
        Scanner input = new Scanner(System.in);
        int num, absNum=0;

        System.out.println("I dare you, enter a number:");
        num = input.nextInt();

        /*
        if (num < 0) {
            absNum = num * -1;
        } else {
            absNum = num;
        }
        */

        //absNum=num<0?num*-1:num;
        // expression ? true : false
        System.out.println("|" + num + "| = " +(num<0?num*-1:num));
    }
}
