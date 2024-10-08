import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[][] ary1 = new int[][]{{1,-2,3},{4,5,6},{7,8,-9}}; // square array
    int[][] ary2 = new int[][]{{4,3,2,1},{5,6,7,3},{9,4,3,2}}; // rectangular array
    int[][] ary3 = new int[][]{{},{},{0,0,0}};
    int[][] ary4 = new int[][]{{0, 3},{5, -6},{8, 5}}; // rectangular array
    int[][] ary5 = new int[][]{{4, 5, 6, 2},{8, 9, 0, 1}}; // rectangular array
    int[][] ary6 = new int[][] {{}, {}, {}, {}}; // empty array
    int[][] ary7 = new int[][] {{3,4},{4, 4, 3},{6},{9,7}}; // ragged array
    int[][] ary8 = new int[][] {{-4,-5,-6},{-1,-2,-3},{-7,-8,-9}};
    int[][] ary9 = new int[][] {{1, 2, 3}};
    int[] ary0 = new int[] {2, 4, 6, 8}; // 1D array
    int[] ary = new int[] {1, 3, 5, 7}; // 1D array

// test cases for arrToString and Arrays.toString
    System.out.println("Expected: [[1, -2, 3], [4, 5, 6], [7, 8, -9]] vs my function: " + arrToString(ary1));
    System.out.println("Expected: [[4, 3, 2, 1], [5, 6, 7, 3], [9, 4, 3, 2]] vs my function: " + arrToString(ary2));
    System.out.println("Expected: [2, 4, 6, 8] vs my function: " + Arrays.toString(ary0));
    System.out.println("Expected: [[], [], [], []] vs my function: " + arrToString(ary6));
    System.out.println("Expected: [1, 3, 5, 7] vs my function: " + Arrays.toString(ary));

    // test cases for arr2DSum
    System.out.println("Expected: 23 vs my function: " + arr2DSum(ary1));
    System.out.println("Expected: 49 vs my function: " + arr2DSum(ary2));
    System.out.println("Expected: 0 vs my function: " + arr2DSum(ary3));
    System.out.println("Expected: 0 vs my function: " + arr2DSum(ary6));
    System.out.println("Expected: 40 vs my function: " + arr2DSum(ary7));

    // test cases for swapRC
    System.out.println("Expected: [[1, 4, 7], [-2, 5, 8], [3, 6, -9]] vs my function: " + arrToString(swapRC(ary1)));
    System.out.println("Expected: [[4, 5, 9], [3, 6, 4], [2, 7, 3], [1, 3, 2]] vs my function: " + arrToString(swapRC(ary2)));
    System.out.println("Expected: [[0, 5, 8], [3, -6, 5]] vs my function: " + arrToString(swapRC(ary4)));
    System.out.println("Expected: [[4, 8], [5, 9], [6, 0], [2, 1]] vs my function: " + arrToString(swapRC(ary5)));
    System.out.println("Expected: [] vs my function: " + arrToString(swapRC(ary6)));

    // test cases for copy
    System.out.println("Expected: [[1, -2, 3], [4, 5, 6], [7, 8, -9]] vs my function: " + arrToString(copy(ary1)));
    System.out.println("Expected: [[4, 3, 2, 1], [5, 6, 7, 3], [9, 4, 3, 2]] vs my function: " + arrToString(copy(ary2)));
    System.out.println("Expected: [[], [], [0, 0, 0]] vs my function: " + arrToString(copy(ary3)));
    System.out.println("Expected: [[], [], [], []] vs my function: " + arrToString(copy(ary6)));
    System.out.println("Expected: [[-4, -5, -6], [-1, -2, -3], [-7, -8, -9] vs my function: " + arrToString(copy(ary8)));

    // test cases for htmlTable
    System.out.println("Expected: <table><tr><td>1</td><td>2</td><td>3</td></tr></table> vs my function: " + htmlTable(ary9));
    System.out.println("Expected: <table><tr><td>4</td><td>5</td><td>6</td><td>2</td></tr><tr><td>8</td><td>9</td><td>0</td><td>1</td></tr></table> vs my function: " + htmlTable(ary5));

    // test cases for replaceNegative
    replaceNegative(ary1);
    replaceNegative(ary3);
    replaceNegative(ary4);
    replaceNegative(ary6);
    replaceNegative(ary8);
    System.out.println("Expected: [[1, 0, 3], [4, 5, 6], [7, 8, 1]] vs my function: " + arrToString(ary1));
    System.out.println("Expected: [[], [], [0, 0, 0]] vs my function: " + arrToString(ary3));
    System.out.println("Expected: [[0, 3], [5, 1], [8, 5]] vs my function: " + arrToString(ary4));
    System.out.println("Expected: [[], [], [], []] vs my function: " + arrToString(ary6));
    System.out.println("Expected: [[[1, 0, 0], [0, 1, 0], [0, 0, 1]]] vs my function: " + arrToString(ary8));

    // test cases for countZeros2D
    System.out.println("Expected: 1 vs my function: " + countZeros2D(ary1));
    System.out.println("Expected: 3 vs my function: " + countZeros2D(ary3));
    System.out.println("Expected: 1 vs my function: " + countZeros2D(ary4));
    System.out.println("Expected: 0 vs my function: " + countZeros2D(ary6));
    System.out.println("Expected: 6 vs my function: " + countZeros2D(ary8));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String x = "[";
    for (int i = 0; i < ary.length; i++) {
      x += ary[i];
      if (i < ary.length - 1) {
        x += ", ";
      }
    }
    return x + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i=0; i<nums.length; i++){
      for (int n=0; n<nums[i].length; n++){
        if (nums[i][n] == 0){
          count = count + 1;
      }
    }
  }
  return count;
}

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int result = 0;
    for (int i = 0; i < nums.length; i++) { // goes through each row
      for (int n = 0; n < nums[i].length; n++) { // goes through each element in the row
        result = result + nums[i][n]; // adds the number at the current element in the current row to the result
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
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for (int i=0; i<nums.length; i++) {
      result[i] = copy1(nums[i]);
    }
    return result;
  }

  public static int[] copy1(int[] num){
    int[] arrayCopy = new int[num.length];
    for (int i=0; i<num.length; i++){
      arrayCopy[i] = num[i];
    }
    return arrayCopy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int n = 0; n < nums[i].length; n++) {
        result[n][i] = nums[i][n]; // swaps nums[rows][columns] into result[columns][rows]
      }
    }
    return result;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int i=0; i<nums.length; i++){
      result += "<tr>";
      for (int n=0; n<nums[i].length; n++){
        result += "<td>" + nums[i][n] + "</td>";
      }
      result += "</tr>";
  }
  result += "</table>";
  return result;
}
}
