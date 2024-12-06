import java.util.Random;

public class Driver {

  public static void makeBorder(int height, int width) {
    System.out.println(Text.CLEAR_SCREEN);
    System.out.println(Text.HIDE_CURSOR);
    Text.color(Text.BLUE, Text.background(Text.CYAN));
    Text.go(1,1);
    for (int i = 0; i <= width; i++) {
      System.out.print("-");
    }
    for (int i = 2; i < height; i++) {
      Text.go(i, 1);
      System.out.print("-");
      Text.go(i, width);
      System.out.print("-");
    }
    Text.go(height, 1);
    for (int i = 0; i <= width; i++) {
      System.out.print("-");
    }
  }


  public static void main(String[] args) {
    System.out.println(Text.CLEAR_SCREEN);
    makeBorder(30, 80);
  }
}
