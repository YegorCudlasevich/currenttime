package dev6;

/**
 * Created by Home on 26.02.2017.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Thed {
    public int getd() {
        Calendar c = new GregorianCalendar();
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        return day;
    }
}
