import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static int shortestPath(String filename) {
    int x = 0;
    int y = 0;
    int dir = 0;
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      Scanner line;
      while(scanner.hasNextLine()){
        line = new Scanner(scanner.nextLine());
        value = new Scanner(scanner.nextInt());
          if (line.charAt(i) == 'L'){
            dir = dir - 90;
          }
          else if (line.charAt(i) == 'R'){
              dir = dir + 90;
            }
          dir = (dir + 360) % 360;
        }
        if (dir == 0) {
          y = y + value;
        }
        else if (dir == 90) {
          x = x + value;
        }
        else if (dir == 180) {
          y = y - value;
        }
        else if (dir == 270) {
          x = x - value;
        }
        }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }
    return (Math.abs(x) + Math.abs(y));
  }

public static void main(String[] args) {
  System.out.println(shortestPath("inputDay1.txt") + " should return 5.");
}

}
