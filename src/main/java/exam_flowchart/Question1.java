package exam_flowchart;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //variables
        int sum=0;
        int counter=0;
        int number=0;
        Scanner input = new Scanner(System.in);

        while (number>=0){
            System.out.println("Please enter a number:");
            number=input.nextInt();
            //if the number is negative, exit immediately from the loop
            if (number<0){
                break;
            }
            counter++;
            sum+=number;
        }

        System.out.println("Average: "+((double)sum/counter));

    }
}
