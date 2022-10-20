package AT;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        int t = sc.nextInt();
        if (t == 0) return;
        while (t-- > 0) {
          BigInteger x = sc.nextBigInteger();
          BigInteger y = sc.nextBigInteger();
          BigInteger n = sc.nextBigInteger();
          System.out.println(x.modPow(y, n));
        }
      }
    }
  }
}
