package FileHandling;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\GitHub\\CoreJava\\src\\FileHandling\\fils\\fileName.txt");
            if (file.createNewFile()) {
                System.out.println("File created with at: " + file.getCanonicalPath());
                System.out.println(file.exists());
            }
            else
                System.out.println("File exist already.");
        }
        catch (IOException ioe){
            System.out.println("Error");
        }
    }
}
