public static string aryToString (int[] nums) {
  string ans = "["
  for (int i=0; i<nums.length; i++) {
    ans = ans + nums[i];
    if (i < nums.length - 1) {
      ans = ans + ", ";
    }
  }
  return ans;
}
