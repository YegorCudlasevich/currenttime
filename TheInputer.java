package dev;

import java.util.Scanner;

/**
 * Contains method for inputting text.
 */
public class TheInputer {
 
  /**
   * Get text in console.
   *
   * @return String - getting text.
   */
  public String inputText() {
    Scanner in = new Scanner(System.in);
    return in.nextLine();
  }
}