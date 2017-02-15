package task_DEV-2;

import java.io.*;
import java.util.*;

public class Rules {
  private static final char ADDITION = '+';
  private static final char SUBTRACTION = '-';
  private static final char MULTIPLICATION = '*';
  private static final char DIVISION = '/';
  private static final char LOW_PRIORITY = 1;
  private static final char HIGH_PRIORITY = 2;
  

 /**
  * The function checks whether the current symbol is the operator
  */
  public static boolean isOperator(char c) {
    switch (c) {
      case ADDITION:
      case SUBTRACTION:
      case MULTIPLICATION:
      case DIVISION:
        return true;
      }
      return false;
  }

 /**
  * Return priority of operation
  * @param op char
  * @return byte
  */
  public static byte opPriority(char op) {
    switch (op) {
      case MULTIPLICATION:
      case DIVISION:
      return HIGH_PRIORITY;
      }
      return LOW_PRIORITY; // +,- here
  }

 /**
  * Counts of expression in reverse polish notation
  * @param inputString
  * @return double result
  */
  public static double calculate(String inputString) throws Exception {
    double dA = 0, dB = 0;
    String stackTmp;
    Deque<Double> stack = new ArrayDeque<Double>();
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
                    case ADDITION:
                      dA += dB;
                      break;
                    case SUBTRACTION:
                      dA -= dB;
                      break;
                    case MULTIPLICATION:
                      dA *= dB;
                      break;
                    case DIVISION:
                      dA /= dB;
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
}