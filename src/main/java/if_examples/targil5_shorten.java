package if_examples;

import java.util.Scanner;

public class targil5_shorten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        //45
        int num1 = number/10; //4
        int num2 = number%10; //5

        /*
        if (num2-num1==1){
            System.out.println("Following");
        } else {
            System.out.println("Not Following");
        }
        */

        System.out.println(num2-num1==1?"Following":"Not Following");

    }
}
