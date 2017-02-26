package dev6;

/**
 * Entry point of program and input info
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class DateAndTimeMain {
    public static void main(String[] args) {
        System.out.println("Input format of time or date: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        if (data.length() == 0 && data.equals("\\d")) {
            System.out.println("Error. Please input format of time or date again: ");
        } else {
            switch (data) {
                case "H":
                    The_h H = new The_h();
                    H.get_h();
                    break;
                case "HH":
                    The_hh HH = new The_hh();
                    HH.get_hh();
                    break;
                case "h":
                    Theh h = new Theh();
                    h.geth();
                    break;
                case "hh":
                    Thehh hh = new Thehh();
                    hh.gethh();
                    break;
                case "f":
                    Thef f = new Thef();
                    f.getf();
                    break;
                case "ff":
                    Theff ff = new Theff();
                    ff.getff();
                    break;
                case "fff":
                    Thefff fff = new Thefff();
                    fff.getfff();
                    break;
                case "d":
                    Thed d = new Thed();
                    d.getd();
                    break;
                case "dd":
                    Thedd dd = new Thedd();
                    dd.getdd();
                    break;
                case "ddd":
                    Theddd ddd = new Theddd();
                    ddd.getddd();
                    break;
                case "dddd":
                    Thedddd dddd = new Thedddd();
                    dddd.getdddd();
                    break;
                case "g":
                    Theg g = new Theg();
                    g.getg();
                    break;
            }
        }
    }
}
