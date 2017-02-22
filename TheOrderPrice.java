package dev;

/**
 * Contains method for inputting price data
 */
public class TheOrderPrice {

    /**
     * Input price data
     */
    public String getPrice() {
        TheInputer in = new TheInputer();
        System.out.print("Please, input order price:");
        String price = in.inputText();
        return price;
    }
}