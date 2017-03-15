package dev7;

/**
 * Entry point of program
 */

import java.util.Scanner;

public class DateTimeValidMain  {
    public static void main(String[] args) {
        Scanner sc_date = new Scanner(System.in);
        System.out.print("Input date in format dd.MM.yyyy here: ");
        String inp_date = sc_date.nextLine();
        TheDateValidator pr_date = new TheDateValidator();
        pr_date.validateDate(inp_date);
        Scanner sc_time = new Scanner(System.in);
        System.out.print("Input time in format hh.mm here: ");
        String inp_time = sc_time.nextLine();
        TheTimeValidator pr = new TheTimeValidator();
        pr.validateTime(inp_time);
    }
}
