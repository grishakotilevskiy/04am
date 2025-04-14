package StringHW;

import java.util.Scanner;

public class task2 {
    public static String removeSpaces(String s) {
        return s.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentences = input.nextLine();

        System.out.println(" U write - " + sentences);
        System.out.println("Without spaces - " +  removeSpaces(sentences));
    }
}
