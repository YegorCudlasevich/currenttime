package task_DEV-2;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;

public class ArithmeticMachine {
  public static void main(String[] args) throws Exception {
    BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
    String inputString;

      try {
        System.out.println("Put your arithmetic expression. Allows math symbals, operations +,-,*,/ and priorities ( и ):");
        inputString = d.readLine();
        inputString = opn(inputString);
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
  private static String opn(String inputString) throws Exception {
    StringBuilder newStack = new StringBuilder(""), outStack = new StringBuilder("");
    char charIn, charTmp;

    for (int i = 0; i < inputString.length(); i++) {
      charIn = inputString.charAt(i);
        if (isOperator(charIn)) {
          while (newStack.length() > 0) {
            charTmp = newStack.substring(newStack.length()-1).charAt(0);
              if (isOperator(charTmp) && (Priority(charIn) <= Priority(charTmp))) {
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

 /**
  * The function checks whether the current symbol is the operator
  */
  private static boolean isOperator(char c) {
    switch (c) {
      case '-':
      case '+':
      case '*':
      case '/':
        return true;
      }
      return false;
  }

 /**
  * Return priority of operation
  * @param op char
  * @return byte
  */
  private static byte Priority(char op) {
    switch (op) {
      case '*':
      case '/':
      return 2;
      }
      return 1; // +,- here
  }

 /**
  * Counts of expression in reverse polish notation
  * @param inputString
  * @return double result
  */
  private static double calculate(String inputString) throws Exception {
    double dA = 0, dB = 0;
    String stackTmp;
    Stack <Double> stack = new Stack <Double>();
    StringTokenizer strToken = new StringTokenizer(inputString);
      while(strToken.hasMoreTokens()) {
        try {
          stackTmp = strToken.nextToken().trim();
            if (1 == stackTmp.length() && isOperator(stackTmp.charAt(0))) {
              if (stack.size() < 2) {
                throw new Exception("Wrong number of data in stack " + stackTmp);
                  }
                  dB = stack.pop();
                  dA = stack.pop();
                  switch (stackTmp.charAt(0)) {
                    case '+':
                      dA += dB;
                      break;
                    case '-':
                      dA -= dB;
                      break;
                    case '/':
                      dA /= dB;
                      break;
                    case '*':
                      dA *= dB;
                      break;
                    default:
                      throw new Exception("Error operation " + stackTmp);
                  }
                  stack.push(dA);
              } else {
                dA = Double.parseDouble(stackTmp);
                stack.push(dA);
              }
          } catch (Exception e) {
              throw new Exception("Wrong symbal in expression");
          }
      }

      if (stack.size() > 1) {
          throw new Exception("The number of operators does not comply with the number of operands");
      }

      return stack.pop();
  }
}