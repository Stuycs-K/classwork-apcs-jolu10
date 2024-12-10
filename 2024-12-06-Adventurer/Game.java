import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Adventurer enemy = new CodeWarrior("Mark", 70, "c++");
    Adventurer player = new Wizard("Harry", 70);

    //do this once
    Scanner userInput = new Scanner(System.in);
    // do the rest many times
    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Welcome, " + userName + "! You are a Wizard fighting a CodeWarrior.");
    System.out.println("Start!");

    while (player.getHP() > 0 && enemy.getHP() > 0) {
      System.out.println(player.getName() + " (player): " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " mana.");
      System.out.println(enemy.getName() + " (opponent): " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());

    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    //Read one line of user input
    String action = userInput.nextLine();
    //Do something with the input
    if (action.equals("a") || action.equals("attack")) {
    System.out.println(player.attack(enemy));
    }
    else if (action.equals("sp") || action.equals("special")) {
    System.out.println(player.specialAttack(enemy));
    }
    else if (action.equals("su") || action.equals("support")) {
    System.out.println(player.support());
    }
    else if (action.equals("quit")) {
    System.out.println("You have quit the game.");
    break;
    }
    else {
      System.out.println("Invalid action. Please type a to attack, sp to use special attack, su to support, or quit to quit.");
      continue;
    }
    System.out.println("Enemy's turn to move.");
    int enemyMove = (int) (Math.random() * 3);
    if (enemyMove == 0) {
      System.out.println(enemy.attack(player));
    }
    else if (enemyMove == 1) {
      System.out.println(enemy.specialAttack(player));
    }
    else {
      System.out.println(enemy.support());
    }
  }

  if (player.getHP() <= 0) {
  System.out.println("Oh no! You have lost! You were defeated by CodeWarrior " + enemy.getName() + ".");
}

if (enemy.getHP() <= 0) {
  System.out.println("Congrats! You have won! You have defeated CodeWarrior " + enemy.getName() + "." );
}
}
}
