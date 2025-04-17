package StringHW;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class task3 {

    public static void checkCurrency(String s){
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String currency = input.nextLine();
        checkCurrency(currency);
    }
}