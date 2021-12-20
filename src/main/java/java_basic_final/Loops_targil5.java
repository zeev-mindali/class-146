package java_basic_final;

import java.util.Scanner;

public class Loops_targil5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base size"); //5
        int base = input.nextInt();
        for (int row = 1; row <= base ; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < (base-row)*2; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
