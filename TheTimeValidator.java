package dev7;

/**
 * Class TheDateValidator contains method
 * which validate date in hh:mm format
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheTimeValidator {

    private final String DATE_PATTERN
        = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

    private final Pattern pattern;
    private Matcher matcher;

    public TheTimeValidator() {
        pattern = Pattern.compile(DATE_PATTERN);
    }

    /**
     * Check format and validation given time.
     *
     * @param time contains string time.
     * @return boolean - true, if format and validation is correct, false if not correct.
     */
    public boolean validateTime(String time) {
        matcher = pattern.matcher(time);
        if (matcher.matches()) {
            matcher.reset();
            if (matcher.find()) {
                String hours = matcher.group(1);
                String minutes = matcher.group(2);
            }
        }
        return false;
    }
}
