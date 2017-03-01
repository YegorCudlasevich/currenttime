package dev6;

/**
 * Created by Home on 26.02.2017.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Theddd {
    public String getddd() {
        Calendar c = new GregorianCalendar();
        String day = "";
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US));
        return day;
    }
}