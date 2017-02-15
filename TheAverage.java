package task_DEV-3;

 /**
  * Class TheAverage has method getAverageAge which checks average age of users
  */
public class TheAverage {
  double getAverageAge() {	
    double average = 0;
    if (users.length > 0) {
      double sum = 0;
      for (int j = 0; j < users.length; j++) {
        sum += users[j].getAge();
      }
      average = sum / users.length; // Sum of users divide by the numbers of users
    }
    System.out.println("The average age of all users is: " + average);
    return average;
  }
}