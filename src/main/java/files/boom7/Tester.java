package files.boom7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int maxNumber = input.nextInt();
        input.nextLine();
        System.out.println("Please enter file name:");
        String fileName = input.nextLine();

        /*
        try {
            Boom boom = new Boom(maxNumber,fileName);
            boom.runBoom();
        } catch (FileNotFoundException e) {
            System.out.println("Error in creating or writting to file....");
        }
        */
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            Boom boom = new Boom(maxNumber, printWriter);
            boom.runBoom();
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}