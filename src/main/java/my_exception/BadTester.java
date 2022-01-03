package my_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BadTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two numbers:");
        try {
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.printf("the result of %d/%d=%d", num1, num2, num1 / num2);
        } catch (InputMismatchException err){
            System.out.println("you can enter only numbers, you little ..... of ....");
        }
//        catch (ArithmeticException err){
//            System.out.println(err.getMessage());
//        }
        catch (Exception err){
            System.out.println("Something was terribly wrong");
            System.out.println(err.getMessage());
        }
    }
}
