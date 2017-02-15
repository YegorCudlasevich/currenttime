package task_DEV-3;

 /**
  * Construct our user. We have fields name, surname, sex and age
  */
public class User {
  private String name;
  private String surname;
  private char sex;
  private int age;
    
    public User(String name, String surname, char sex, int age) {
      this.name = name;
      this.surname = surname;
      this.sex = sex;
      this.age = age;
    }
    
    public String getName() {
      return name;
    }
    
    public int getSurname() {
      return surname;
    }
    
    public char getSex() {
      return sex;
    }
    
    public int getAge() {
      return age;
    }
    
    @Override
    public String toString() {
      return "Name: " + getName() + "\n"
        + "Surname: " + getSurname() + "\n"
        + "Sex (m for male and f for female): " + getSex() + "\n"
        + "Age: " + getAge() + "\n";
    }
 
}