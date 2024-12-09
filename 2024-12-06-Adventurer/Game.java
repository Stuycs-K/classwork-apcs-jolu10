import java.util.Scanner;
public class Game {

  Adventurer player = new CodeWarrior("Mark", 70, c++);
  Adventurer enemy = new Wizard("Harry", 70);


  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);
  }
}
