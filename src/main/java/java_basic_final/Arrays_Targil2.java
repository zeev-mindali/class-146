package java_basic_final;

import java.util.Scanner;

public class Arrays_Targil2 {
    public static void main(String[] args) {
        //declartion
        Scanner input = new Scanner(System.in);
        //int[] arr1={87,12,56,32};
        //int[] arr2={19,87,13,21,56};
        int[] arr1=new int[4], arr2=new int[5];
        arr1=randomValues(arr1);
        arr2=randomValues(arr2);
        printArray(arr1);
        System.out.println();
        printArray(arr2);
        System.out.println();
        int[] arr3=compareArrays(arr1,arr2);
        printArray(arr3);
    }

    public static int[] randomValues(int[] arr){
        for (int index = 0; index < arr.length; index++) {
            arr[index] = (int)(Math.random()*90)+10;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int item:arr){
            System.out.print(item+" ");
        }
    }

    public static int[] compareArrays(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length];
        int counter=0;
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr2.length; col++) {
                if (arr1[row]==arr2[col]){
                    temp[counter]=arr1[row];
                    counter++;
                    break;
                }
            }
        }
        return createSmallArray(temp,counter);
    }

    public static int[] createSmallArray(int[] arr, int counter) {
        int[] temp = new int[counter];
        for (int index = 0; index < temp.length; index++) {
            temp[index]=arr[index];
        }
        return temp;
    }
}
