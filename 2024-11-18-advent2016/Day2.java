import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
  public static String bathroomCode(String filename) {
    char[][] keypad = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    int row = 1;
    int column = 1;
    String numbers = "";
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      while(scanner.hasNext()) {
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
          char dir = line.charAt(i);
          if (dir == 'U' && row > 0) {
            row = row - 1;
          } else if (dir == 'D' && row < 2) {
            row = row + 1;
          } else if (dir == 'L' && column > 0) {
            column = column - 1;
          } else if (dir == 'R' && column < 2) {
            column = column + 1;
          }
        }
        numbers = numbers + keypad[row][column];
      }
        scanner.close();
        } catch (FileNotFoundException e) {
        System.out.println("File not found.");
      }
      return numbers;
    }

    public static void main(String[] args) {
      System.out.println("The bathroom code is " + bathroomCode("inputDay2.txt") + ".");
    }
  }
