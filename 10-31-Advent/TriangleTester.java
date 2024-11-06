import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static boolean testTriangle (int side0, int side1, int side2) {
    return ((side0 + side1 > side2) && (side1 + side2 > side0) && (side2 + side0 > side1));
  }

public static int countTrianglesA(String filename) {
  int result = 0;
  try {
    File file = new File(filename);
    Scanner scanner = new Scanner(file);
    Scanner line;
    int[] side = new int[3];
    while(scanner.hasNextLine()){
      line = new Scanner(scanner.nextLine());
      for (int i = 0; i < 3; i++){
        if (line.hasNext()){
          side[i] = line.nextInt();
        }
      }
      if (testTriangle(side[0], side[1], side[2])) {
        result++;
      }
    }
    scanner.close();
  } catch (FileNotFoundException e) {
    System.out.println("File not found.");
  }
  return result;
}

public static int countTrianglesB(String filename) {
  int result = 0;
  try {
    File file = new File(filename);
    Scanner scanner = new Scanner(file);
    Scanner line;
    int[][] side = new int[3][3];
    while (scanner.hasNextLine()) {
      for (int i = 0; i < 3; i++) {
        line = new Scanner(scanner.nextLine());
        for (int j = 0; j < 3; j++) {
          if (line.hasNext()) {
            side[i][j] = line.nextInt();
          }
        }
      }
      for (int i = 0; i < 3; i++) {
        if (testTriangle(side[0][i], side[1][i], side[2][i])) {
          result++;
        }
      }
    }
    scanner.close();
  } catch (FileNotFoundException e) {
    System.out.println("File not found.");
  }
  return result;
}

public static void main(String[] args) {
  System.out.println(countTrianglesA("inputTri.txt"));
  System.out.println(countTrianglesB("inputTri.txt"));
}

}
