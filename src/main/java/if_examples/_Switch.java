package if_examples;

import java.util.Scanner;

public class _Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opr;  // + - * ....
        int num1, num2, res = 0;
        boolean isOk = true;

        System.out.println("Please enter a math expression:");
        num1 = input.nextInt();
        opr = input.next().charAt(0);
        num2 = input.nextInt();

        /*
        if (opr == '+') {
            res = num1 + num2;
        } else if (opr == '-') {
            res = num1 - num2;
        } else if (opr == '*') {
            res = num1 * num2;
        } else {
            isOk = false;
        }
        */

        switch (opr){
            case '+':
                res=num1+num2;
                //break;
            case '-':
                res=num1-num2;
                break;
            case '*':
                res=num1*num2;
                break;
            case '^':
                res=num1*num1;
                break;
            default:
                isOk=false;
        }

        if (isOk) {
            System.out.println("your result is: " + res);
        } else {
            System.out.println("WTF?!?!?!?");
        }

    }
}
