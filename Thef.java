package dev6;

/**
 * Created by Home on 26.02.2017.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Thef {
    public String getf () {
        Calendar c = new GregorianCalendar();
        int millisecond = c.get(Calendar.MILLISECOND);
        String millisecond_str = String.valueOf(millisecond);
        millisecond_str = millisecond_str.substring(0, 1);
        System.out.println(millisecond_str);
        return millisecond_str;
    }
}
