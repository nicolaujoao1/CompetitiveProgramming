package O;

import java.util.Scanner;
public class Main {

  // last memoization index
  static int lastMemo;
  // memoization array
  static final Integer[] memo = new Integer[500_001];
  // init memoization array and index
  static {
    memo[0] = memo[1] = 1;
    lastMemo = 1;
  }

  public static int josephus(final int n, final int k) {
    // the accumulator trampoline function
    for (int i = lastMemo + 1; i <= n ; ++i) {
      memo[i] = (memo[i-1] + k - 1) % i + 1;
      lastMemo = i;
    }
    return memo[n];
  }


  public static void main(String[] args) {
    final int k = 2;
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        int n = sc.nextInt();
        if (n == 0) return;
        if (n == 1) {
          System.out.println(1);
        } else {
          System.out.println(Math.floorMod(josephus(n, k) - (k - 1), n));
        }
      }
    }
  }
}
