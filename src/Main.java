import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String words = "On_e T_wo T_hre_e Four five";
        int countWords = words.split("_").length;
        System.out.println(Arrays.toString(words.split(" ")));
        System.out.println(countWords);
    }
}