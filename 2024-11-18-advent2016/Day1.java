import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static int shortestPath(String filename) {
    int blocks = 0;
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      Scanner line;
      while(scanner.hasNextLine()){
        line = new Scanner(scanner.nextLine());
        for (int i = 0; i < 3; i++){
          if (line.hasNext()){
            side[i] = line.nextInt();
          }
        }
        }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }
    return blocks;
  }

public static void main(String[] args) {
  System.out.println(shortestPath("inputDay1.txt"));
}

}
