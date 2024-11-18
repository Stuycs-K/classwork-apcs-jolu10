import java.util.ArrayList;

public class Driver{
  public static void main(String[] args) {
    // testing mixLists
    ArrayList<String> x = ArrayListPractice.createRandomArray(200);
    ArrayList<String> y = ArrayListPractice.createRandomArray(150);
    ArrayList<String> mixedXY = ArrayListPractice.mixLists(x, y);
    System.out.println("List x: " + x);
    System.out.println("List y: " + y);
    System.out.println("Mixed list: " + mixedXY);

    ArrayList<String> a = ArrayListPractice.createRandomArray(18);
    ArrayList<String> b = ArrayListPractice.createRandomArray(16);
    ArrayListPractice.replaceEmpty(a);
    ArrayListPractice.replaceEmpty(b);
    ArrayList<String> mixedAB = ArrayListPractice.mixLists(a, b);
    System.out.println("List a: " + a);
    System.out.println("List b: " + b);
    System.out.println("Mixed list: " + mixedAB);

    // testing createRandomArray
    ArrayList<String> arr0 = ArrayListPractice.createRandomArray(10);
    System.out.println("Array 0: " + arr0);
    ArrayList<String> arr1 = ArrayListPractice.createRandomArray(200);
    System.out.println("Array 1: " + arr1);

    // testing replaceEmpty
    ArrayListPractice.replaceEmpty(arr0);
    ArrayListPractice.replaceEmpty(arr1);
    System.out.println("arr0 modified to replace empty strings: " + arr0);
    System.out.println("arr1 modified to replace empty strings: " + arr1);

    // testing makeReversedList
    ArrayList<String> reversedArr0 = ArrayListPractice.makeReversedList(arr0);
    ArrayList<String> reversedArr1 = ArrayListPractice.makeReversedList(arr1);
    System.out.println("arr0 in reversed order: " + reversedArr0);
    System.out.println("arr1 in reversed order: " + reversedArr1);
  }
}
