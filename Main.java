package dev;

/**
 * Entry point of our program
 */
public class Main {
    private final double JUN_SALARY = 500;
    private final int JUN_PRODUCTIVITY = 1;
    private final double MID_SALARY = 1200;
    private final int MID_PRODUCTIVITY = 2;
    private final double SEN_SALARY = 1800;
    private final int SEN_PRODUCTIVITY = 3;
    private final double LEAD_SALARY = 2400;
    private final int LEAD_PRODUCTIVITY = 4;

    /**
     * Method main which run all processes
     */
    public static void main(String[] in) {
        if (in != null && in.length > 0) {
            TheRequiredProductivity in_productivity = new TheRequiredProductivity();
            in_productivity.getProductivity();

            TheOrderPrice in_price = new TheOrderPrice();
            in_price.getPrice();

            TheSelectionCriterion in_criterion = new TheSelectionCriterion();
            in_criterion.getCriterion();
        } else {
            System.out.print("Error. Try to input data again.");
        }
        switch () { //TODO: make a change criterion method
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
        TheMaxEffeciencyCalculator in_effecincy = new TheMaxEffeciencyCalculator();
        in_effecincy.getEffeciency();

        TheMinCostCalculator in_min_cost = new TheMinCostCalculator();
        in_min_cost.getMinCost();

        TheMinNumEmployeeCalculator in_num_employee = new TheMinNumEmployeeCalculator();
        in_num_employee.getMinNumEmployee();
    }
}
