package dev6;

/**
 * Created by Home on 26.02.2017.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Theff {
    public String getff () {
        Calendar c = new GregorianCalendar();
        int millisecond = c.get(Calendar.MILLISECOND);
        String millisecond_str = String.valueOf(millisecond);
        millisecond_str = millisecond_str.substring(0, 2);
        System.out.println(millisecond_str);
        return millisecond_str;
    }
}
