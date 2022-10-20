package AV;

import java.util.BitSet;
import java.util.Scanner;

public class Main {

  public static int reverse(int i) {
    return Integer.parseInt(
        new StringBuilder(String.valueOf(i))
            .reverse()
            .toString());
  }

  public static void main(String[] args) {

    // problem limit
    final int MAX = 1_000_001;

    try (Scanner sc = new Scanner(System.in)) {
      // precomputate primes using sieve
      // use nonPrime to avoid O(n) setAll to true
      BitSet nonPrimes = new BitSet(1_000_001);
      for (int i = 2; i * i < MAX; ++i) {
        if (!nonPrimes.get(i)) {
          for (int j = i * i; j < MAX; j += i) {
            nonPrimes.set(j);
          }
        }
      }
      while (sc.hasNextInt()) {
        int n = sc.nextInt();
        if (nonPrimes.get(n)) {
          System.out.println(n + " is not prime.");
        } else {
          int reversed = reverse(n);
          if (reversed == n || nonPrimes.get(reversed)) {
            System.out.println(n + " is prime.");
          } else {
            System.out.println(n + " is emirp.");
          }
        }
      }
    }
  }
}
