package java_basic_final;

import java.util.Scanner;

public class Loops_Targil7_perfect_code {
    public static void main(String[] args) {
        //declaration
        final int ARRAY_LENGTH=5;
        int[] arr1=new int[ARRAY_LENGTH],arr2=new int[ARRAY_LENGTH];

        //solution
        compareArrays(getArrayInput(arr1),getArrayInput(arr2));
    }

    public static void compareArrays(int[] arr1, int[] arr2){
        //compare arrays
        for (int index = 0; index < arr1.length; index++) {
            if (arr1[index]==arr2[index]){
                System.out.print(index+" ");
            }
        }
    }

    public static int[] getArrayInput(int[] arr){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter five numbers to array:");
        for (int index = 0; index < arr.length; index++) {
            arr[index]=input.nextInt();
        }
        return arr;
    }
}
