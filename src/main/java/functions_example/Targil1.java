package functions_example;

import java.util.Scanner;

public class Targil1 {
    public static void main(String[] args) {
        //get a digit and number, and return times of appearance
        Scanner input = new Scanner(System.in);
        //System.out.println("Please enter a number:");
        //int userNumber = input.nextInt();
        int userNumber = (int)(Math.random()*Integer.MAX_VALUE);
        //System.out.println("Please enter a digit:");
        //int userDigit = input.nextInt();
        int userDigit = (int)(Math.random()*10);

        System.out.printf("your digit:%d appears %d in %d",userDigit,appears(userNumber,userDigit),userNumber);
    }

    private static int appears(int userNumber, int userDigit) {
        int counter=0;
        while(userNumber>0){
            if (userNumber%10==userDigit){
                counter++;
            }
            userNumber/=10;
        }
        return counter;
    }
}
