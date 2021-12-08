package if_examples;

import java.util.Scanner;

public class _Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter day of week");
        int day=input.nextInt();

        switch (day){
            case 1:
                System.out.println("Dikaun");
                break;
            case 2:
                System.out.println("Atzbani");
                break;
            case 3:
                System.out.println("Lo nigmar");
                break;
            case 4:
                System.out.println("Meyutar");
                break;
            case 5:
                System.out.println("Working day");
                break;
            case 6:
            case 7:
                System.out.println("Shabbes");
        }
    }
}
