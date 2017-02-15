package task_DEV-3;

 /**
  * Class TheHomonyms has method surnameCheck which checks thes same surnames of users
  */
public class TheHomonyms {
  public surnameCheck() {
    HashSet<String> used = new HashSet<>();
    for (int i = 0; i < users.length; i++) { 
      if (used.contains(students[i].getSurname()) { 
        continue;
          } else {
              used.add(students[i].getSurname());
            }
      for (int j = i + 1; j < users.length; j++) { // Compare all surnames
        if (students[i].getSurname() == students[j].getSurname()) {
          String namesakes = used.add(students[j].getSurname();
        }
      }
    }
    System.out.print("Homonym(s) are - " + namesakes);
    return namesakes;
  }
}