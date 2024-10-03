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
  public static int[][] swapRC(int[][]nums){ // swaps rows and columns: 2 rows 3 columns becomes 3 rows 2 columns and vice versa
    int[][] result = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int n = 0; n < nums[i].length; n++) {
        result[n][i] = nums[i][n]; // swaps nums[rows][columns] into result[columns][rows]
      }
    }
    return result;
  }

  //3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){
  int[][] result = new int[vals[0].length][vals.length];
  for (int i = 0; i < vals.length; i++) {
    for (int n = 0; n < vals[i].length; n++) {
      if (vals[i][n] < 0) {
        if (i == n) {
          vals[i][n] = 1;
        }
        else {
          vals[i][n] = 0;
        }
      }
}
}
      return result;
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
 // public static int[][] copy(int[][] nums){
//  return null;//placeholder so it compiles
//}

  public static void main (String args[]){
    int[][] ary1 = new int[][]{{1,-2,3},{4,5,6},{7,8,-9}}; // square array
    int[][] ary2 = new int[][]{{4,3,2,1},{5,6,7,3},{9,4,3,2}}; // rectangular array
    int[][] ary3 = new int[][]{{},{},{0,0,0}};
    int[][] ary4 = new int[][]{{0, 3},{5, -6},{8, 5}}; // rectangular array
    int[][] ary5 = new int[][]{{4, 5, 6, 2},{8, 9, 0, 1}}; // rectangular array
    int[][] ary6 = new int[][] {{}, {}, {}, {}}; // empty array
    int[][] ary7 = new int[][] {{3,4},{4, 4, 3},{6},{9,7}}; // ragged array
    int[][] ary8 = new int[][] {{-4,-5,-6},{-1,-2,-3},{-7,-8,-9}};

// test cases for arrToString
    System.out.println("Expected: [[1, -2, 3], [4, 5, 6], [7, 8, -9]] vs my function: " + arrToString(ary1));
    System.out.println("Expected: [[4, 3, 2, 1], [5, 6, 7, 3], [9, 4, 3, 2]] vs my function: " + arrToString(ary2));
    System.out.println("Expected: [[], [], [0, 0, 0]] vs my function: " + arrToString(ary3));
    System.out.println("Expected: [[], [], [], []] vs my function: " + arrToString(ary6));
    System.out.println("Expected: [[3, 4], [4, 4, 3], [6], [9, 7]] vs my function: " + arrToString(ary7));

    // test cases for arr2DSum
    System.out.println("Expected: 45 vs my function: " + arr2DSum(ary1));
    System.out.println("Expected: 49 vs my function: " + arr2DSum(ary2));
    System.out.println("Expected: 0 vs my function: " + arr2DSum(ary3));
    System.out.println("Expected: 0 vs my function: " + arr2DSum(ary6));
    System.out.println("Expected: 40 vs my function: " + arr2DSum(ary7));

    // test cases for swapRC
    System.out.println("Expected: [[1, 4, 7], [2, 5, 8], [3, 6, -9]] vs my function: " + arrToString(swapRC(ary1)));
    System.out.println("Expected: [[4, 5, 9], [3, 6, 4], [2, 7, 3], [1, 3, 2]] vs my function: " + arrToString(swapRC(ary2)));
    System.out.println("Expected: [[0, 5, 8], [3, -6, 5]] vs my function: " + arrToString(swapRC(ary4)));
    System.out.println("Expected: [[4, 8], [5, 9], [6, 0], [2, 1]] vs my function: " + arrToString(swapRC(ary5)));
    System.out.println("Expected: [] vs my function: " + arrToString(swapRC(ary6)));

    // test cases for replaceNegative
    System.out.println("Expected: [[1, 0, 3], [4, 5, 6], [7, 8, -1]] vs my function: " + replaceNegative(ary1));
    System.out.println("Expected: [[], [], [0, 0, 0]] vs my function: " + replaceNegative(ary3));
    System.out.println("Expected: [[0, 3], [5, -1], [8, 5]] vs my function: " + replaceNegative(ary4));
    System.out.println("Expected: [] vs my function: " + replaceNegative(ary6));
    System.out.println("Expected: [[[-1, 0, 0], [0, -1, 0], [0, 0, -1]]] vs my function: " + replaceNegative(ary7));

    // test cases for copy
    System.out.println("Expected: [[1, -2, 3], [4, 5, 6], [7, 8, -9]] vs my function: " + copy(ary1));
    System.out.println("Expected: [[4, 3, 2, 1], [5, 6, 7, 3], [9, 4, 3, 2]] vs my function: " + copy(ary2));
    System.out.println("Expected: [[], [], [0, 0, 0]] vs my function: " + copy(ary3));
    System.out.println("Expected: [[], [], [], []] vs my function: " + copy(ary6));
    System.out.println("Expected: [[-4, -5, -6], [-1, -2, -3], [-7, -8, -9] vs my function: " + copy(ary8));
  }
}
