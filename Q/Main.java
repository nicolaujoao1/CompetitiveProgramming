package Q;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // create a array to store results
      String[] results = new String[10_005];
      // create a list to store result order
      List<Integer> order = new ArrayList<>();
      // store the largest N
      int max = 0;
      int t = sc.nextInt();
      // get all test cases
      while (t-- > 0) {
        int n = sc.nextInt();
        if (n > max) {
          max = n;
        }
        order.add(n);
        results[n] = "";
      }
      // pre calculate all values until the max
      int[] digits = new int[10];
      for (int i = 1; i <= max; ++i) {
        String number = Integer.toString(i);
        for (int j = 0; j < number.length(); ++j) {
          digits[number.charAt(j) - '0']++;
        }
        if (results[i] != null) {
          results[i] = String
              .format("%d %d %d %d %d %d %d %d %d %d", 
                  digits[0], 
                  digits[1],
                  digits[2],
                  digits[3],
                  digits[4],
                  digits[5],
                  digits[6],
                  digits[7],
                  digits[8],
                  digits[9]);
        }
      }
      // print results in order
      for (Integer result : order) {
        System.out.println(results[result]);
      }
    }   
  }
}
