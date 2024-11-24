import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1Part2 {
  public static int firstLocationVisitedTwice(String filename) {
    int x = 0;
    int y = 0;
    int dir = 0;
    String visitedLocation = "0, 0";
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      while(scanner.hasNext()) {
        String line = scanner.next().replaceAll(",", "");
        char direction = line.charAt(0);
        int value = Integer.parseInt(line.substring(1));
          if (direction == 'L'){
            dir = dir - 90;
          }
          else if (direction == 'R'){
              dir = dir + 90;
            }
          dir = (dir + 360) % 360;

          for(int i = 0; i < value; i++) {
        if (dir == 0) {
          y = y + 1;
        } else if (dir == 90) {
          x = x + 1;
        } else if (dir == 180) {
          y = y - 1;
        } else if (dir == 270) {
          x = x - 1;
        }

        String currentLocation = (x + ", " + y);
        if (visitedLocation.contains(currentLocation)) {
          return (Math.abs(x) + Math.abs(y));
        }
        visitedLocation = visitedLocation + currentLocation;
      }
    }
      scanner.close();
      } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }
    return -1;
  }

public static void main(String[] args) {
  System.out.println("The first location visited twice is " + firstLocationVisitedTwice("inputDay1.txt") + " blocks away.");
}

}
