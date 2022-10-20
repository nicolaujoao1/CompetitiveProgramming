package AY;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      for (int t = Integer.parseInt(sc.nextLine()); t > 0; --t) {
        List<BigInteger> numbers = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(sc.nextLine());

        while (tokenizer.hasMoreTokens()) {
          numbers.add(new BigInteger(tokenizer.nextToken()));
        }

        BigInteger maxGcd = BigInteger.ONE;
        for (int i = 0; i < numbers.size(); ++i) {
          for (int j = i + 1; j < numbers.size(); ++j) {
            maxGcd = maxGcd.max(numbers.get(i).gcd(numbers.get(j)));
          }
        }

        System.out.println(maxGcd);
      }
    }
  }
}