package loops;

import java.util.Scanner;

public class TargilKefel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        //ask user to enter a correct number
        do {
            System.out.println("Enter a number between 5-10:");
            num= input.nextInt();
        } while (num<5 || num >10);

        //print kefel board
        for (int counter=1;counter<=10;counter++){
            System.out.print(counter*num+"\t");
        }
    }
}
