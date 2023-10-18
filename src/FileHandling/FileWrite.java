package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\GitHub\\CoreJava\\src\\FileHandling\\fils\\fileName.txt");
            fileWriter.write("Hello world!\n" +
                    "Hello India!\n" +
                    "Hello Indore!\n");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException ioe){
            System.out.println("Error");
            ioe.printStackTrace();
        }
    }
}
