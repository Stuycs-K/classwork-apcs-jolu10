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

public static int[] returnCopy(int[]ary) {
  int[] copy = new int[ary.length];
  int i = 0;
  for (int num : ary){
    copy[i] = num;
    i++;
  }
  return copy;
}

public static int[] concatArray(int[]ary1,int[]ary2) {
  int[] result = new int[ary1.length + ary2.length];
  for (int i = 0; i < ary1.length; i++) {
    result[i] = ary1[i];
  }
  for (int i= 0; i < ary2.length; i++) {
    result[ary1.length + i] = ary2[i];
  }
  return result;
}

public static void main (String args[]) {
  int[] a = new int[] {1, 3, 7};
  int[] b = new int[] {44, 3, 8};
  int[] c = new int[] {};
  int[] d = new int[] {1, 2, 3, 4, 5};

   // test case aryToString:
   System.out.println("Expected [1, 3, 7] vs my function: " + aryToString(a));
   System.out.println("Expected [44, 3, 8] vs my function: " + aryToString(b));
   System.out.println("Expected [] vs my function: " + aryToString(c));

   // test case returnCopy:
   System.out.println("Expected [1, 3, 7] vs my function: " + aryToString(returnCopy(a)));
   System.out.println("Expected [1, 2, 3, 4, 5] vs my function: " + aryToString(returnCopy(d)));
   System.out.println("Expected [] vs my function: " + aryToString(returnCopy(c)));

   // test case concatArray:
   System.out.println("Expected [1, 3, 7] vs my function: " + aryToString(concatArray(a, c)));
   System.out.println("Expected [44, 3, 8, 1, 3, 7] vs my function: " + aryToString(concatArray(b, a)));
   System.out.println("Expected [1, 2, 3, 4, 5, 44, 3, 8] vs my function: " + aryToString(concatArray(d, b)));
   System.out.println("Expected [1, 2, 3, 4, 5, 1, 2, 3, 4, 5] vs my function: " + aryToString(concatArray(d, d)));
}
}
