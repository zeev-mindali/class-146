package oop.if_examples;

import java.util.Scanner;

public class Targil10_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a date:");
        //1234 5 6 7 8
        int month = input.nextInt()/10000%100;

        /*
        if (month>=3 && month<=5){
            System.out.println("Spring");
        } else if (month>=6 && month <=8){
            System.out.println("summer");
        } else if (month>=9 && month <=11){
            System.out.println("fall");
        } else {
            System.out.println("My loved season");
        }
        */
        String res;

        switch (month){
            case 3:
            case 4:
            case 5:
              res="Spring";
              break;
            case 6:
            case 7:
            case 8:
                res="Summer :(";
                break;
            case 9:
            case 10:
            case 11:
                res = "Fall";
                break;
            case 12:
            case 1:
            case 2:
                res = "Winter :)";
                break;
            default:
                res="WTF???";
        }
        System.out.println("your season is :"+res);
    }

}
