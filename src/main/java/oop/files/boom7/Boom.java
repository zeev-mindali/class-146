package oop.files.boom7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Boom {
    private int maxNumber;
    private String fileName;
    private PrintWriter printWriter;
    boolean havePrintWriter = false;

    public Boom(int maxNumber, String fileName) throws FileNotFoundException {
        this.maxNumber = maxNumber;
        this.fileName = fileName;
        this.printWriter = new PrintWriter(fileName);
        this.havePrintWriter = true;
    }

    public Boom(int maxNumber, PrintWriter printWriter) {
        this.maxNumber = maxNumber;
        this.printWriter = printWriter;

    }

    public void runBoom() throws FileNotFoundException {
        for (int counter = 0; counter < maxNumber; counter++) {
            if (checkBoom(counter)) {
                System.out.println("boom");
                printWriter.println("boom!!!");
            } else {
                System.out.println(counter);
                printWriter.println(counter);
            }
        }
        if (havePrintWriter) {
            printWriter.close();
        }
    }

    private boolean checkBoom(int counter) {
        if (counter % 7 == 0) {
            return true;
        }
        //iteration with while
        int temp = counter;
        while (temp > 0) {
            if (temp % 10 == 7) {
                return true;
            }
            temp /= 10;
        }
        return false;
    }

}
