package java_basic_final;

import java.util.Scanner;

public class Loops_targil8 {
    public static void main(String[] args) {
        //declartion
        final int ARRAY_SIZE=5;
        int[] arr1=new int[ARRAY_SIZE],arr2=new int[ARRAY_SIZE],arr3;

        //sum the arrays
        /*  junior
        arr1=getArrayInput(arr1);
        arr2=getArrayInput(arr2);
        arr3=sumArray(arr1,arr2);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        //for (int item:arr3) {
         */
        //senior
        for (int item:sumArray(getArrayInput(arr1),getArrayInput(arr2))) {
            System.out.print(item+" ");
        }
    }
    public static int[] sumArray(int[] arr1, int[] arr2){
        int arr[] = new int[arr1.length];
        for (int index = 0; index < arr1.length; index++) {
            arr[index]=arr1[index]+arr2[index];
        }
        return arr;
    }

    public static int[] getArrayInput(int[] arr){
        System.out.println("Please enter five numbers for this array:");
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < arr.length; index++) {
            arr[index]=input.nextInt();
        }
        return arr;
    }
}
