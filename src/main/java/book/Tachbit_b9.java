package book;

import java.util.Scanner;

public class Tachbit_b9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1,ch2=0,ch3=0;

        while (true){
            System.out.println("Please enter a char:");
            ch1=ch2;
            ch2=ch3;
            ch3 = input.next().charAt(0);
            if (ch2==ch1+1 && ch3==ch2+1){
                System.out.println("Good bye my brother from another mother");
                break;
            }
        }
    }
}
