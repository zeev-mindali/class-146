package loops;

import java.util.Scanner;

public class Targil3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In your mother in law, please enter a number:");
        int num=0;
        while (num%10!=num/10 || num==0){
            num= input.nextInt();
        }
        System.out.println("Finish him.....");
    }
}
