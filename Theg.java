package dev6;

/**
 * Created by Home on 26.02.2017.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Theg {
    public int getg() {
        Calendar c = new GregorianCalendar();
        int era = c.get(Calendar.ERA);
        if (era == 1) {
            System.out.println("A.D.");
        } else {
            System.out.println("B.D.");
        }
        return era;
    }
}