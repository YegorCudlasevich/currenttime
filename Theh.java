package dev6;

/**
 * Created by Home on 26.02.2017.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Theh {
    public int geth() {
        Calendar c = new GregorianCalendar();
        int hour = c.get(Calendar.HOUR);
        System.out.println(hour);
        return hour;
    }
}
