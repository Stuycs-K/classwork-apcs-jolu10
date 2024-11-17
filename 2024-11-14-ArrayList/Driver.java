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

    ArrayList<String> reversedArr0 = ArrayListPractice.makeReversedList(arr0);
    ArrayList<String> reversedArr1 = ArrayListPractice.makeReversedList(arr1);
    System.out.println("arr0 in reversed order: " + reversedArr0);
    System.out.println("arr1 in reversed order: " + reversedArr1);

    ArrayList<String> a = ArrayListPractice.createRandomArray(4);
    ArrayList<String> b = ArrayListPractice.createRandomArray(3);
    ArrayList<String> mixed = ArrayListPractice.mixLists(a, b);
    System.out.println("List a: " + a);
    System.out.println("List b: " + b);
    System.out.println("Mixed list: " + mixed);

  }
}
