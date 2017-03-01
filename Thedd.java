package dev6;

/**
 * Created by Home on 26.02.2017.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Thedd {
    public int getdd() {
        Calendar c = new GregorianCalendar();
        int day = c.get(Calendar.DAY_OF_MONTH);
        String str_day = String.valueOf(day);
        if (str_day.length() < 2) {
            System.out.println("0" + str_day);
        } else {
            System.out.println(str_day);
        }
        return day;
    }
}