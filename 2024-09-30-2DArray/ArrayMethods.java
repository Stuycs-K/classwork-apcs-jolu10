public class ArrayMethods {

  // Emily Mai emilym384@nycstudents.net
  // Joy Lu joyl28@nycstudents.net

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[] nums) {
    String x = "[";
    for (int i = 0; i < nums.length; i++) {
      x += nums[i];
      if (i < nums.length - 1) {
        x += ", ";
      }
    }
    return x + "]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    String x = "["; // outer bracket
    for (int i = 0; i < ary.length; i++) {
      x += "["; // inner bracket

      for (int n = 0; n < ary[i].length; n++) {
        x += ary[i][n];

        if (n < ary[i].length - 1) {
          x += ", "; // comma + space between values
        }
      }

      x += "]"; // inner bracket

      if (i < ary.length - 1) {
        x += ", "; // comma + space between arrays
      }
    }
    x += "]"; // outer bracket
    return x;
  }

  /*Return the sum of all of the values in the 2D array */
   public static int arr2DSum(int[][]nums){
  //  use a nested loop to solve this
  int result = 0;
  for (int i = 0; i < nums.length; i++) { // goes through each row
    for (int n = 0; n < nums[i].length; n++) { // goes through each element in the row
      result = result + nums[i][n]; // adds the number at the current element in the current row to the result
    }
  }
  return result;
}

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
//  public static int[][] swapRC(int[][]nums){
//    return new int[1][1];

  public static void main (String args[]){
    int[][] ary1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    int[][] ary2 = new int[][]{{4,3,2},{5,6},{9,4,3}};
    int[][] ary3 = new int[][]{{1},{3,2,1},{0,0,0}};

// test cases for arrToString
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] vs my function: " + arrToString(ary1));
    System.out.println("Expected: [[4, 3, 2], [5, 6], [9, 4, 3]] vs my function: " + arrToString(ary2));
    System.out.println("Expected: [[1], [3, 2, 1], [0, 0, 0]] vs my function: " + arrToString(ary3));
    // test cases for arr2DSum
    System.out.println("Expected: 45 vs my function: " + arr2DSum(ary1));
    System.out.println("Expected: 36 vs my function: " + arr2DSum(ary2));
    System.out.println("Expected: 7 vs my function: " + arr2DSum(ary3));
  }
}
