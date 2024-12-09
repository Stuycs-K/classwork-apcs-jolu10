public class Driver {
  public static void main(String[] args){
    Adventurer p1 = new Wizard("Merlin");
    Adventurer p2 = new Wizard("Harry", 70);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println("Should return Hocus Pocus: " + p1.getSpecialName());
    System.out.println("Should return Hocus Pocus: " + p2.getSpecialName());

    System.out.println(p1.getName() + " has " + p1.getHP() + " HP.");
    System.out.println(p2.getName() + " has " + p2.getHP() + " HP.");

    System.out.println("Should return 20: " + p2.getHP());
    System.out.println("Should return 20: " + p2.getHP());

    System.out.println(p1.attack(p2));
    System.out.println(p2.attack(p1));
    System.out.println(p1.specialAttack(p2));
    System.out.println(p2.specialAttack(p1));
    System.out.println(p1.support(p2));
    System.out.println(p1.support());
    System.out.println(p2.support(p2));
    System.out.println(p2.support());
    System.out.println(p1.attack(p2));
    System.out.println(p1.attack(p2));
    System.out.println(p1.attack(p2));
    System.out.println(p1.attack(p2));
    System.out.println(p2.attack(p1)); // should not work because HP is 0
    System.out.println(p2.specialAttack(p1));
    System.out.println(p2.support());
  }
}
