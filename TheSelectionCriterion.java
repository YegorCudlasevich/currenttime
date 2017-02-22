package dev;

/**
 * Contains method for choose criterion
 */
public class TheSelectionCriterion {
    /**
     * Choose one criterion
     */
    public String getCriterion() {
        TheInputer in = new TheInputer();
        System.out.print("Please, change one of three selection criterion: " + "\n"
                          + "1. Maximum efficiency within the balance."  + "\n"
                          + "2. The minimum cost for a fixed productivity." + "\n"
                          + "3. The minimum number of employees for fixed productivity "
                          + "(without Juniors).");
        String criterion = in.inputText();
        return criterion;
    }
}