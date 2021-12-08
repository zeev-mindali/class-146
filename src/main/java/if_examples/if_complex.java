package if_examples;

import java.util.Scanner;

public class if_complex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("Please enter 3 numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Num 1 is the biggest :)");
        }
    }
}
