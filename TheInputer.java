package task_DEV-3;

 /**
  * Class TheInputer. Input our information about users
  */
public class TheInputer() {
  public static void main(String[] args) throws IOException {
    ArrayList<User> users = new ArrayList<User>();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Add a new user");
      while (!reader.readLine().equals("n")) {
        System.out.print("Please, input name of user:");
        String name = reader.readLine();

        System.out.print("Input surname of user:");
        String surname = reader.readLine();

        System.out.print("Input sex of user (m for male and f for female):");
        char sex = reader.charAt(0);

        System.out.print("Input age of user:");
        int age = Integer.parseInt(reader.readLine());

        User user = new User(name, surname, sex, age);
        users.add(user);
        System.out.print("Do yo want to add a new user? (input y for yes or n for no):");
      }

      reader.close();

      for (User st : users) {
        System.out.println(st);
      }
  }
}