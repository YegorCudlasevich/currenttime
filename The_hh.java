package dev6;

/**
 * Created by Home on 26.02.2017.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class The_hh {
    public int get_hh() {
        Calendar c = new GregorianCalendar();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        String str_hour = String.valueOf(hour);
        if (str_hour.length() < 2) {
            System.out.println("0" + str_hour);
        } else {
            System.out.println(str_hour);
        }
        return hour;
    }
}
