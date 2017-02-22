package dev;

/**
 * Contains method for inputting price data
 */
public class TheOrderPrice {

    /**
     * Input price data
     */
    public String getPrice() {
        TheInputter in = new TheInputter();
        System.out.print("Please, input order price:");
        String price = in.inputText();
        return price;
    }
}