package task_DEV-3;

 /**
  * TheOldest class checks who is the most old user
  */
public class TheOldestUser {
  int getLargeAge() { // Find the largest age
    int max = users[0].getAge();
    for (int i = 0; i < users.length; i++) {
      if (students[i].getAge() > max) {
        max = students[i].getAge();
      }
    }
    return max;
  }	
  
  int getOldest() { // Output oldest user
  	System.out.println("The oldest user is: ");
  	int search = max;
    for (int i = 0; i < users.length; i++) {
      if (users[i].getAge() == search) {
      	int oldPerson = students[i].getSurname()
        System.out.println(oldPerson);
      }
    }
    return oldPerson;
  }
}