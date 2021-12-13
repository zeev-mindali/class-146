package loops;

import java.util.Scanner;

public class Targil3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In your mother in law, please enter a number:");
        int num;

        do {
            num = input.nextInt();
        } while (num % 10 != num / 10 || num == 0);

        System.out.println("Finish him.....");
    }
}
