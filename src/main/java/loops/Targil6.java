package loops;

import java.util.Scanner;

public class Targil6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number 10-99:");
        int userNumber = input.nextInt();
        for (int counter=1;counter<=userNumber;counter++){
            if (counter%3==0 && (counter%10+counter/10<5)){
                System.out.println(counter);
            }

        }
    }
}
