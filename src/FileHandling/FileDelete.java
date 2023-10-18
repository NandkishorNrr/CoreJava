package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDelete {
    public static void main(String[] args) {
        File file = new File("C:\\GitHub\\CoreJava\\src\\FileHandling\\fils\\temp.txt");
        String fileName = "";

        try{
            if (file.createNewFile()) {
                fileName = file.getName();
                System.out.println(fileName + " is created.");
            }
            else
                System.out.println(file.getName() + " is exist already.");
        }
        catch (IOException ioe){
            System.out.println("Error");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number...");
        int n = in.nextInt();

        if (file.delete()) {
            System.out.println(file.getName() + " is deleted.");
            System.out.println(file.exists());
        }
        else {
            System.out.println("Failed to delete the file.");
        }
    }
}
