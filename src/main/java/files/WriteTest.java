package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteTest {
    public static void main(String[] args) {
        File file = new File("saar.txt");
        PrintWriter printWriter=null;
        if (file.exists()){
            System.out.println("File already created.....");
        } else {
            try {
                printWriter = new PrintWriter(file);
                printWriter.println("Hello classs 146\n===============\n");
                printWriter.println("Your exam grade: ");
                printWriter.println(100);
            } catch (FileNotFoundException err) {
                System.out.println("Huston we have a problem, file not found");
            } finally {
                printWriter.close();
            }
        }
        System.out.println("Total file size:"+file.length());

    }
}
