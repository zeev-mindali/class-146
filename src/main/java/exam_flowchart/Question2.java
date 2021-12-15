package exam_flowchart;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //variables
        boolean isPrimary=true;
        Scanner input=new Scanner(System.in);
        int number;

        System.out.println("Please enter a number:");
        number= input.nextInt();

        for (int counter=2;counter<number/2;counter++){
            if (number%counter==0){
                isPrimary=false;
                break;
            }
        }

        //System.out.println(number+" is primary:"+isPrimary);
        System.out.println(number+(isPrimary?" is":" is not")+" primary");

    }
}
