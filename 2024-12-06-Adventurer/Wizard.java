public class Wizard implements Adventurer{
  private int mana;
  private int maxMana;

  public Wizard(String name){
    super(name, 10);
  }
  public Wizard(String name, int hp){
    super(name, hp);
  }

  public String getSpecialName(){
    return "Hocus Pocus";
  }

  public int getSpecial() {
    return this.mana;
  }

  public void getSpecial(int n) {
    this.mana = n;
  }

  public int getSpecialMax() {
    return maxMana;
  }

  public static void main(String[] args){

  }
}
