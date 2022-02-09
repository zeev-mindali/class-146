package oop.book;

import java.util.Scanner;

public class loops_targil5 {
    //1234567 -> 1325476
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber,tempNumber,newNumber=0,location=1,digit1,digit2;

        System.out.println("Please enter a number:");
        tempNumber = userNumber = input.nextInt();
        while (tempNumber>0){
            //6 7
            digit1=tempNumber%10;
            digit2=tempNumber%100/10;
            newNumber+=(digit1*10+digit2)*location;
            //newNumber+=(tempNumber%10*10+tempNumber%100/10)*location;
            location*=100;
            tempNumber/=100;
            if (tempNumber<10){
                newNumber+=tempNumber*location;
                break;
            }
        }

        System.out.println("you number is (ta da da da dammmm:"+newNumber);
    }
}
