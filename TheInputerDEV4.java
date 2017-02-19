package dev;

 /**
  * Class TheInputer. Input our information about users
  */
public class TheInputer {
 /**
  * The entry point
  */
	public static void main (String[] args) {
	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Input your text here. Press 'Enter' for two times for exit: ");
        while (!reader.readLine().equals("n")) {
          String text = in.readLine();
          TheLettersPairsChecker add_first = new TheLettersPairsChecker();
          add.isLetterPairs();

          TheFiveLettersChecker add_second = TheFiveLettersChecker();
          add_second.isFiveLettersInText();
          System.out.print("Do yo want to add a new text? (input y for yes or n for no):");
       }
      in.close();
	}
}