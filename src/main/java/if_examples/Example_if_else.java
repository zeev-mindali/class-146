package if_examples;

import java.util.Scanner;

public class Example_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Please enter 3 numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
    /*
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+" is the biggest :)");
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println(num2+" is the biggest :)");
            } else {
                System.out.println(num3+" is the biggest :)");
            }
        }
     */

        int bigNumber;
        if (num1>num2 && num1>num3){
            bigNumber=num1;
        } else if (num2>num1 && num2>num3){
            bigNumber=num2;
        } else {
            bigNumber=num3;
        }

        System.out.println("The biggest number is (drum sound): "+bigNumber);

    }
}
