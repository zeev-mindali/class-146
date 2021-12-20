package java_basic_final;

import java.util.Scanner;

public class Loops_targil5_functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base size"); //5
        printRow(input.nextInt());
    }

    public static void printRow(int base) {
        for (int row = 1; row <= base; row++) {
            printCol(row, '*');
            printCol((base - row) * 2, ' ');
            printCol(row, '*');
            System.out.println();
        }
    }

    public static void printCol(int length, char sign) {
        for (int col = 0; col < length; col++) {
            System.out.print(sign);
        }
    }
}
