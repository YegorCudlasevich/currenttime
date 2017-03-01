package dev7;

/**
 * Class TheDateValidator contains method
 * which validate date in dd.MM.yyy format
 */

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheDateValidator {

    private final String DATE_PATTERN
        = "(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])"
        + "\\.((19|20)\\d\\d)";
    private final String JAN = "1";
    private final String JAN_0 = "01";
    private final String FEB = "2";
    private final String FEB_0= "02";
    private final String MARCH = "3";
    private final String MARCH_0 = "03";
    private final String MAY = "5";
    private final String MAY_0 = "05";
    private final String JUL = "7";
    private final String JUL_0 = "07";
    private final String AUG = "8";
    private final String AUG_0 = "08";
    private final String OCT = "10";
    private final String DEC = "12";

    private final Pattern pattern;
    private Matcher matcher;

    public TheDateValidator() {
        pattern = Pattern.compile(DATE_PATTERN);
    }

    /**
     * Check format and validation given date.
     *
     * @param date contains string date.
     * @return boolean - true, if format and validation is correct, false if not correct.
     */
    public boolean validateDate(String date) {
        matcher = pattern.matcher(date);
        if (matcher.matches()) {
            matcher.reset();
            if (matcher.find()) {
                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));
                if ("31".equals(day)) {
                    // 31 days only in Jan, March, May, July,
                    // August, October and December
                    return Arrays.asList(new String[]{JAN, JAN_0, MARCH, MARCH_0,
                        MAY, MAY_0, JUL, JUL_0, AUG, AUG_0, OCT, DEC})
                        .contains(month);
                } else if (FEB.equals(month) || FEB_0.equals(month)) {
                    // Check february
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                // Leap year
                                return Integer.parseInt(day) <= 29;
                            }
                            // Common year
                            return Integer.parseInt(day) <= 28;
                        }
                        return Integer.parseInt(day) <= 29;
                    } else {
                        return Integer.parseInt(day) <= 28;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}