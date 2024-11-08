// Before, getName() just returned name but after overriding this method, it returns "The Mighty" + name.
//This tells us that the new method is the one that's used instead of the original method.
// When a subclass overrides a method, the subclass's version of the method is called instead of the superclass's.
// Bird b2 did not work because Animal can not be converted to Bird.
// This is because Bird is-a Animal but Animal is not necessarily a Bird.
public class Driver {
  public static void main(String[] args) {
    Animal a1 = new Animal("Moo", 14, "Bob");
    a1.speak();

    Bird b1 = new Bird("Squaaaak", 10, "Doug", 1.0, "Red");
    b1.speak();

    // Bird b2 = new Animal("Chirp", 7, "Jimmy");
    // b2.speak();

    Animal a2 = new Bird("Tweet", 9, "John", 2.5, "Blue");
    a2.speak();
  }
}
