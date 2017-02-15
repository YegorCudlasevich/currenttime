package task_DEV-2;

import java.io.*;
import java.util.*;

public class Calculator {
  public static void main(String[] args) throws Exception {
    BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
    String inputString;
      try {
        System.out.println("Put your arithmetic expression. Allows math symbals, operations +,-,*,/ and brackets ():");
        inputString = d.readLine();
        inputString = method(inputString);
        System.out.println(calculate(inputString));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
  }


  /**
   * Convert string into reverse polish notation
   * @param inputString Input row
   * @return Output row in reverse polish notation
   */
  public static String method(String inputString) throws Exception {
    StringBuilder newStack = new StringBuilder(""), outStack = new StringBuilder("");
    char charIn, charTmp;

    for (int i = 0; i < inputString.length(); i++) {
      charIn = inputString.charAt(i);
        if (isOperator(charIn)) {
          while (newStack.length() > 0) {
            charTmp = newStack.substring(newStack.length()-1).charAt(0);
              if (isOperator(charTmp) && (opPriority(charIn) <= opPriority(charTmp))) {
                outStack.append(" ").append(charTmp).append(" ");
                newStack.setLength(newStack.length()-1);
                } else {
                  outStack.append(" ");
                  break;
                  }
              }
              outStack.append(" ");
              newStack.append(charIn);
          } else if ('(' == charIn) {
              newStack.append(charIn);
          } else if (')' == charIn) {
              charTmp = newStack.substring(newStack.length()-1).charAt(0);
              while ('(' != charTmp) {
                  if (newStack.length() < 1) {
                      throw new Exception("Error parsing brackets. Check the expression.");
                  }
                  outStack.append(" ").append(charTmp);
                  newStack.setLength(newStack.length()-1);
                  charTmp = newStack.substring(newStack.length()-1).charAt(0);
              }
              newStack.setLength(newStack.length()-1);
          } else {
              // Add into output sequence if symbol not a operator
              outStack.append(charIn);
          }
      }

        // Add into input string if stack has any operators
    while (newStack.length() > 0) {
      outStack.append(" ").append(newStack.substring(newStack.length()-1));
      newStack.setLength(newStack.length()-1);
      }

      return  outStack.toString();
  }
}