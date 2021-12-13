package loops;

import java.util.Scanner;

public class HowNotToDo {
    public static void main(String[] args) {
        //get two numbers add the first number to the left of the second one.
        //5 123 -> 5123
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers, digit and a number:");
        int digit = input.nextInt();
        int number = input.nextInt();
        //int theNumber = Integer.parseInt(digit+""+number);

        //first of all , let's find the size of the number
        int counter=0;
        int temp=number;
        while (temp>0){
            temp/=10;
            counter++;
        }
        int theNumber = (int)Math.pow(10,counter)*digit+number;
        System.out.println("your number is :"+theNumber);
    }
}
