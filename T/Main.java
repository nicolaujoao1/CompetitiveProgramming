package T;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // precomputate results
      int[] oddSums = new int[101];
      for (int i = 1; i < oddSums.length; ++i) {
        if ((i & 1) == 1) {
          oddSums[i] = oddSums[i-1] + i;
        } else {
          oddSums[i] = oddSums[i-1];
        }
      }
      int t = sc.nextInt();
      for (int i = 1; i <= t; ++i) {
        int a = Math.max(1, sc.nextInt());
        int b = sc.nextInt();
        System.out.printf("Case %d: %d\n", i, oddSums[b] - oddSums[a-1]);
      }
    }
  }
}
