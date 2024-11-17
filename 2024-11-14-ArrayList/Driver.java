import java.util.ArrayList;

public class Driver{
  public static void main(String[] args) {
    ArrayList<String> arr0 = ArrayListPractice.createRandomArray(10);
    System.out.println("Array 0: " + arr0);
    ArrayList<String> arr1 = ArrayListPractice.createRandomArray(200);
    System.out.println("Array 1: " + arr1);

    ArrayListPractice.replaceEmpty(arr0);
    ArrayListPractice.replaceEmpty(arr1);
    System.out.println("arr0 modified to replace empty strings: " + arr0);
    System.out.println("arr1 modified to replace empty strings: " + arr1);

    

  }
}
