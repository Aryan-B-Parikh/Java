//learn RegEx in Java
package Basics.Lab.Lab_Work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        
        boolean result = Pattern.matches("[a-z]+", "hello");
        System.out.println(result);
        
        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("abcabdab");
        
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        
        String text = "Hello123World456";
        String[] numbers = text.split("\\D+");
        for (String num : numbers) {
            System.out.println(num);
        }
        
        String replaced = text.replaceAll("\\d+", "X");
        System.out.println(replaced);
    }
}

