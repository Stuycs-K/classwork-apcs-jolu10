public class Wizard extends Adventurer{
  private int mana;
  private int maxMana = 100;

  public Wizard(String name){
    super(name, 100);
    this.mana = 50;
  }
  public Wizard(String name, int hp){
    super(name, hp);
    this.mana = 50;
  }

  public String getSpecialName(){
    return "Hocus Pocus";
  }

  public int getSpecial() {
    return mana;
  }

  public void setSpecial(int n) {
    mana = n;
  }

  public int getSpecialMax() {
    return maxMana;
  }

  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    if (this.getHP() > 0) {
      if (this.mana >= 5) {
        other.setHP(Math.max(0, (other.getHP() - 15)));
        this.setSpecial(Math.max(0, this.mana - 5));
        return other.getName() + " was attacked by " + this.getName() + ". " + other.getName() + "'s HP is now " + other.getHP() + ". " + this.getName() + "'s mana is now " + this.mana + ".";
      }
      else {
        return this.getName() + " can not attack. Insufficient mana.";
      }
    }
    else {
      return this.getName() + " can not attack. HP is 0.";
    }
}

  //heall or buff the target adventurer
  public String support(Adventurer other) {
    if (this.getHP() > 0) {
      if (this.mana >= 5) {
        other.setHP(other.getHP() + 10);
        this.setSpecial(Math.max(0, this.mana - 5));
        return other.getName() + " was healed by " + this.getName() + ". " + other.getName() + "'s HP is now " + other.getHP() + ". " + this.getName() + "'s mana is now " + this.mana + ".";
      }
      else {
        return this.getName() + " can not heal. Insufficient mana.";
      }
    }
    else {
      return this.getName() + " can not heal. HP is 0.";
    }
}

  //heall or buff self
  public String support() {
    if (this.getHP() > 0) {
      if (this.mana >= 5) {
        this.setHP(this.getHP() + 10);
        this.setSpecial(Math.max(0, this.mana - 5));
        return this.getName() + " healed themself. " + this.getName() + "'s HP is now " + this.getHP() + ". " + this.getName() + "'s mana is now " + this.mana + ".";
      }
      else {
        return this.getName() + " can not heal. Insufficient mana.";
      }
    }
    else {
      return this.getName() + " can not heal. HP is 0.";
    }
}

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    if (this.getHP() > 0) {
    if (this.mana > 10) {
      other.setHP(Math.max(0, (other.getHP() - 30)));
      return this.getName() + " used special attack on " + other.getName() + "! " + other.getName() + "'s HP is now " + other.getHP() + ".";
    }
    else {
      return "Insufficient mana for special attack.";
    }
  }
  else {
    return this.getName() + " can not use special attack. HP is 0.";
  }
}
}
