package dev;

/**
 * Contains method for inputting productivity data
 */
public class TheRequiredProductivity {
    /**
     * Input required productivity data
     */
    public String getProductivity() {
        TheInputter in = new TheInputter();
        System.out.print("Please, input the required productivity:");
        String req_productivity = in.inputText();
        return req_productivity;
    }
}