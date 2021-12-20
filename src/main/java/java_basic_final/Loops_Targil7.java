package java_basic_final;

import java.util.Scanner;

public class Loops_Targil7 {
    public static void main(String[] args) {
        //declaration
        final int ARRAY_LENGTH=5;
        Scanner input = new Scanner(System.in);
        int[] arr1=new int[ARRAY_LENGTH],arr2=new int[ARRAY_LENGTH];

        //insert data
        System.out.println("Insert data for first array:");
        for (int index = 0; index < arr1.length; index++) {
            arr1[index]=input.nextInt();
        }
        System.out.println("Insert data for second array:");
        for (int index = 0; index < arr2.length; index++) {
            arr2[index]=input.nextInt();
        }
        for (int index = 0; index < arr1.length; index++) {
            if (arr1[index]==arr2[index]){
                System.out.print(index+" ");
            }
        }
        //compare arrays
    }
}
