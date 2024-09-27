public static String aryToString (int[] nums) {
  String ans = "[";
  for (int i=0; i<nums.length; i++) {
    ans = ans + nums[i];
    if (i < nums.length - 1) {
      ans = ans + ", ";
    }
  }
  return ans;
}


public static void main (String args[]) {
  int[] = a;

   // test case aryToString:
   a=[1, 3, 7];
   System.out.println("Expected "[1, 3, 7]" +" vs my function: "+ aryToString[a];
}
