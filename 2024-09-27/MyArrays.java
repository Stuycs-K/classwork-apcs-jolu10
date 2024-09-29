public class MyArrays {

public static String aryToString (int[] nums) {
  String ans = "[";
  for (int i=0; i<nums.length; i++) {
    ans = ans + nums[i];
    if (i < nums.length - 1) {
      ans = ans + ", ";
    }
  }
  ans = ans + "]";
  return ans;
}


public static void main (String args[]) {
  int[] a = new int[] {1, 3, 7};

   // test case aryToString:
   System.out.println("Expected [1, 3, 7] vs my function: " + aryToString(a));
}
}
