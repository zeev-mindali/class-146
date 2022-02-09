package oop.book;

import java.util.Scanner;

public class loops_targil2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber,tempNumber,newNumber=0,location=1;

        System.out.println("Please enter a number:");
        tempNumber = userNumber = input.nextInt();
        while (tempNumber>0){
            newNumber+=tempNumber%10*location;
            location*=10;
            tempNumber/=100;
        }
        System.out.printf("the soultion for %d is %d (Ta da da da dammmmm)",userNumber,newNumber);
    }
}
