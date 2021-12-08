package if_examples;

import java.util.Scanner;

public class OurSchool {
    public static void main(String[] args) {
        //90 and up -> excellent
        //80 - 90 -> very good
        //60 - 80 -> passed
        //     60 - 70 -> you need to work harder
        // under 60 -> Failed
        String result;
        Scanner input = new Scanner(System.in);
        System.out.println("Your true grade:");
        int grade = input.nextInt();
        if (grade>=90){
            result="excellent";
        } else if (grade>=80 ){
            result="Very good";
        } else if (grade>=60){
            result="Passed";
            if (grade<70) {
                result+=", you should work harder";
            }
        } else {
            result="Failed";
        }

        System.out.println("your result: "+result);
    }
}
