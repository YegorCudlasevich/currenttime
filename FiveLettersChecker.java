package dev;

/**
 * TheFiveLettersChecker. Check five letters in text
 */
import java.util.Arrays;
import java.util.List;
import java.lang.*;

public class TheFiveLettersChecker {
    /**
     * Method isFiveLettersInText. Check five letters in text
     */
        public Integer isFiveLettersInText(String[] text) {
        List<String> stringList = Arrays.asList(text.split(" "));
        int count = 0;
        for (String temp : stringList) {
            final String onlyLetters = temp.replaceAll("[^\\p{L}]", "");
            System.out.println(onlyLetters.length());
            if (onlyLetters.length() > 5) {
                count++;
            }
        }
        System.out.println("Numbers of > 5 letters: " + count);
        return count;
    }
}
