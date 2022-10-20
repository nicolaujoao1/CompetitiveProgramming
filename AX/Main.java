package AX;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        int n = sc.nextInt();
        if (n == 0) break;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i < n; ++i) {
          BigInteger bigI = BigInteger.valueOf(i);
          for (int j = i + 1; j <= n; ++j) {
            BigInteger bigJ = BigInteger.valueOf(j);
            sum = sum.add(bigI.gcd(bigJ));
          }
        }
        System.out.println(sum);
      }
    }
  }
}
