import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> arr = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      String num = ("" + (int)(Math.random() * 11));
      if (num.equals("0")) {
        arr.add("");
      }
      else {
        arr.add(num);
      }
    }
    return arr;
  }

public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for (int i = 0; i < original.size(); i++) {
    if (original.get(i).equals("")) {
      original.set(i, "Empty");
    }
  }
}

}
