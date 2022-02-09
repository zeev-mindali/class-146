package oop.book;

import java.util.Scanner;

public class Arrays_targil6 {
    //enter array of char, between first capital and last capital , make all capital
    //a b c D e f g h I j
    public static void main(String[] args) {
        //variables
        Scanner input = new Scanner(System.in);
        char[] myArray = new char[10];
        boolean isCapital = false;

        System.out.printf("please enter %d chars:\n",myArray.length);
        //my_oop.loops :)
        for (int index=0;index< myArray.length;index++){
            myArray[index] = input.next().charAt(0);
            if (checkCapital(myArray[index])){
                isCapital=!isCapital;
                continue;
            }
            if (isCapital){
                myArray[index] = (char)(myArray[index]-32);
            }
        }

        //function :o)
        printArray(myArray);
    }

    public static void printArray(char[] charArray){
        for (int counter = 0; counter < charArray.length; counter++) {
            System.out.print(charArray[counter]+" ");
        }
    }

    public static boolean checkCapital(char singleChar){
        return singleChar>='A' && singleChar<='Z';
    }
}
