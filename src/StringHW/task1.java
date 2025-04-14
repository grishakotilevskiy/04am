package StringHW;

import java.util.Scanner;

public class task1 {

    public static String biggestWord(String s){
        String[] words = s.split(" ");
        String biggestWord = "";
        for(String word : words){
            if(word.length() > biggestWord.length()){
                biggestWord = word;
            }
        }
        return biggestWord;
    }

public static String reverseWord(String s){
    String[] words = s.split(" ");
    String str = new StringBuilder(words[1]).reverse().toString();
    return str;
}

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String sentences = input.nextLine();

        System.out.println(" Biggest word in sentences  - " + biggestWord(sentences));
        System.out.println("Lenght of biggest word is -  " + biggestWord(sentences).length());
        System.out.println("Second word in reverse - "  + reverseWord(sentences) );

    }
}
