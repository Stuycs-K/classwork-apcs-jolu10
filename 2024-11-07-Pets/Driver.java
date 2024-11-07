public class Driver {
  public static void main(String[] args) {
    Animal a1 = new Animal("Moo", 14, "Bob");
    a1.speak();

    Bird b1 = new Bird("Squaaaak", 10, "Doug", 1.0, "Red");
    b1.speak();
  }
}
