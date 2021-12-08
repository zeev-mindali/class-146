package if_examples;

import java.util.Scanner;

public class Targil_kita {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        String result;

        System.out.println("In your mother in law, please enter a char:");
        letter = input.next().charAt(0);

        //letter
        //number
        //symbol

        if ((letter >= 'a' && letter <= 'z') ||
                (letter >= 'A' && letter <= 'Z')) {
            result = "letter";
        } else if (letter >= '0' && letter <= '9') {
            result = "number";
        } else {
            result = "symbol";
        }

        System.out.println("your input is "+result);

        //stam
    }
}
