package oop.functions_example;

import java.util.Scanner;

public class MyFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int numberLength = findLength(number);
        System.out.println("number length:"+findLength(number));
        helloGery();

    }

    public static int findLength(int userNumber){
        int counter=0;
        while (userNumber>0){
            counter++;
            userNumber/=10;
        }
        return counter;
    }

    public static void helloGery(){
        String name = "██████╗ ███████╗██████╗ ██╗   ██╗\n" +
                "██╔════╝ ██╔════╝██╔══██╗╚██╗ ██╔╝\n" +
                "██║  ███╗█████╗  ██████╔╝ ╚████╔╝ \n" +
                "██║   ██║██╔══╝  ██╔══██╗  ╚██╔╝  \n" +
                "╚██████╔╝███████╗██║  ██║   ██║   \n" +
                " ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   \n" +
                "                                  ";
        System.out.println(name);

    }
}
