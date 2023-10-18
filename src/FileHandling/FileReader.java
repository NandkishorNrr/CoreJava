package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        int i = 1;
        try {
            File file = new File("C:\\GitHub\\CoreJava\\src\\FileHandling\\fils\\fileName.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()){
                System.out.println(i++ + " - " + in.nextLine());
            }
            in.close();
        }
        catch (IOException ioe){
            System.out.println("Error");
            ioe.printStackTrace();
        }
    }
}
