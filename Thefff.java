package dev6;

/**
 * Created by Home on 26.02.2017.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Thefff {
    public String getfff () {
        Calendar c = new GregorianCalendar();
        int millisecond = c.get(Calendar.MILLISECOND);
        String millisecond_str = String.valueOf(millisecond);
        System.out.println(millisecond_str);
        return millisecond_str;
    }
}