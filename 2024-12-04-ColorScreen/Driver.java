import java.util.Random;

public class Driver {

  public static void makeBorder(int height, int width) {
    System.out.println(Text.CLEAR_SCREEN);
    System.out.println(Text.HIDE_CURSOR);
    Text.color(Text.MAGENTA, Text.background(Text.CYAN));
    Text.go(1,1);
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    for (int i = 2; i < height; i++) {
      Text.go(i, 1);
      System.out.print("|");
      Text.go(i, width);
      System.out.print("|");
    }
    Text.go(height, 1);
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
  }

  public static void threeRandomNumbers(int width) {
    int[] numbers = new int[3];
    for (int i = 0; i < 3; i++) {
      numbers[i] = (int)(Math.random() * 100);
    }
    for (int i = 0; i < 3; i++) {
      Text.go(2, (2 + i * ((width - 4) / 3)));
      int number = numbers[i];
      if (number < 25) {
        Text.color(Text.RED, Text.BRIGHT);
      }
      else if (number > 75) {
        Text.color(Text.GREEN, Text.BRIGHT);
      }
        else {
          Text.color(Text.WHITE);
        }
        System.out.print(number);
      }
    }

    public static void makeHorizontalSeparator(int row, int width) {
      Text.color(Text.RED, Text.background(Text.YELLOW));
      for(int i = 1;i <= width; i++) {
        Text.go(row, i);
        System.out.print("&");
    }
  }

  public static void main(String[] args) {
    System.out.println(Text.CLEAR_SCREEN);
    System.out.println(Text.HIDE_CURSOR);
    makeBorder(30, 80);
    threeRandomNumbers(80);
    makeHorizontalSeparator(3, 80);
    Text.go(31, 1);
    System.out.print(Text.RESET);
    System.out.print(Text.SHOW_CURSOR);
  }
}
