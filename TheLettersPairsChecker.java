package dev;

/**
 * Class TheLettersPairsChecker. Check letters in text
 */
import java.util.HashSet;
import java.util.Arrays;

public class TheLettersPairsChecker {
    final char ONE = '1';
    final char TWO = '2';
    final char THREE = '3';
    final char FOUR = '4';
    final char FIVE = '5';
    final char SIX = '6';
    final char SEVEN = '7';
    final char EIGHT = '8';
    final char NINE = '9';
    final char ZERO = '0';

    final char EXCLAMATION_POINT = '!';
    final char SERIF = '"';
    final char INTERNET_DOG = '@';
    final char POUND = '£';
    final char NUM = '№';
    final char SEMICOLON = ';';
    final char DOLLAR = '$';
    final char PERCENT = '%';
    final char UP_SYMB = '^';
    final char COLON = ':';
    final char AND = '&';
    final char QUESTION_POINT = '?';
    final char STAR = '*';
    final char LEFT_BRACKET = '(';
    final char RIGHT_BRACKET = ')';
    final char MINUS = '-';
    final char PLUS = '+';
    final char UNDERSCORE = '_';
    final char EXACTLY = '=';
    final char NEARLY_EXACTLY = '~';
    final char MORE_POINT = '>';
    final char LESS_POINT = '<';
    final char LATTICE = '#';
    final char SLASH = '/';
    final char STICK = '|';
    final char FIG_L_BRACKET = '{';
    final char FIG_R_BRACKET = '{';
    final char SQ_L_BRACKET = '[';
    final char SQ_R_BRACKET = ']';
    final char ONE_SERIF = '`';
    final char DOT = '.';
    final char VIRGULE = ',';

    public double isLetterPairs (String[] text) {
        /**
         * Method TheLettersPairsChecker. Check letters in text
         */
        HashSet<Character> symbols = new  HashSet<Character>(
            Arrays.asList(EXCLAMATION_POINT, SERIF, INTERNET_DOG, POUND, NUM,
                SEMICOLON, DOLLAR, PERCENT, UP_SYMB, COLON, AND,QUESTION_POINT,
                STAR, LEFT_BRACKET, RIGHT_BRACKET, MINUS, PLUS, UNDERSCORE,
                EXACTLY, NEARLY_EXACTLY, MORE_POINT, LESS_POINT, LATTICE,
                SLASH, STICK, FIG_L_BRACKET, FIG_R_BRACKET, SQ_L_BRACKET,
                SQ_R_BRACKET, ONE_SERIF, DOT, VIRGULE));
        HashSet<Character> numbers = new HashSet<Character>(
            Arrays.asList(ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
                EIGHT, NINE, ZERO));
        int count = 0;
        int count2 =0;
        for (Character character1: text.toCharArray()) {
            if (symbols.contains(character1)){
                count++;
            }
        }
        for (Character character2: text.toCharArray()) {
            if (numbers.contains(character2)){
                count2++;
            }
        }
        System.out.println("Symbols: " + count);
        System.out.println("Numbers: " + count2);
        System.out.println("Freq 0f symb " + (count+count2)/text.length());
        double freq = text.length() / (text.length() - (count + count2));
        System.out.println("Frequency:" + freq);
        return freq;

    }
}
