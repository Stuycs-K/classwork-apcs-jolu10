public class Fib {
  public static int fibSequence(int n) {
    if (n < 2) {
      return n;
    }
    else {
      return (fibSequence(n-2) + fibSequence(n-1));
    }
  }

  public static void main(String[] args) {
    System.out.println(fibSequence(46)); // 46 is the largest n that calculates under 10 seconds
  }
}
