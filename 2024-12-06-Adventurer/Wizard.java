public class Wizard implements Adventurer{
  public Wizard(String name){
    this(name, 10);
  }
  public Wizard(String name, int hp){
    this.name = name;
    this.HP = hp;
    this.maxHP = hp;
  }

  public static void main(String[] args){

  }
}
