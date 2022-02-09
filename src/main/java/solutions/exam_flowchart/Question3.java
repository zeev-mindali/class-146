package solutions.exam_flowchart;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //variables
        Scanner input = new Scanner(System.in);
        int from,to,temp;
        boolean has7;

        System.out.println("Please enter from and to numbers");
        from=input.nextInt();
        to=input.nextInt();

        for (int counter=from;counter<=to;counter++){
            has7=false;
            temp=counter;
            while(temp>0){
                if (temp%10==7){
                    has7=true;
                    break;
                }
                temp/=10;
            }
            if (counter%7==0 || has7){
                System.out.println("Boom");
            } else {
                System.out.println(counter);
            }
        }

    }
}
