package I;

import java.util.Scanner;

public class Main {

  // precompute reverse clock
  static int[] reverseClockHours = new int[25];
  static int[] reverseClickMinutes = new int[61];
  static {
    // set reverse hours
    int startHour = 1;
    int finalHour = 23;
    reverseClockHours[12] = 12;
    while (startHour < finalHour) {
      reverseClockHours[startHour] = finalHour;
      reverseClockHours[finalHour] = startHour;
      ++startHour;
      --finalHour;
    }
    // set reverse minutes
    int startMinute = 0;
    int endMinute = 60;
    while (startMinute <= endMinute) {
      reverseClickMinutes[startMinute] = endMinute % 60;
      reverseClickMinutes[endMinute] = startMinute;
      ++startMinute;
      --endMinute;
    }
  }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int t = Integer.parseInt(sc.nextLine());
      while (t-- > 0) {
        String line = sc.nextLine();
        if (line.equals("12:00") || line.equals("06:00")) {
          System.out.println(line);
          continue;
        }
        String[] input = line.split(":");
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);
        
        int reverseHour = Math.floorMod(reverseClockHours[hour] - (minute > 0 ? 1 : 0), 24) % 12;
        int reverseMinute = reverseClickMinutes[minute];

        System.out.printf("%02d:%02d\n", 
            reverseHour == 0 ? 12 : reverseHour, 
            reverseMinute);
      }
    }
  }
}
