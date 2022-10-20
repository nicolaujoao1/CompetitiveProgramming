package J;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        String[] input = sc.nextLine().split(" +");
        /** Start hour */
        int startHour = Integer.parseInt(input[0]);
        int startMinute = Integer.parseInt(input[1]);
        /** End hour */
        int endHour = Integer.parseInt(input[2]);
        int endMinute = Integer.parseInt(input[3]);
        /** Stop condition */
        if ((startHour + startMinute + endHour + endMinute) == 0) {
          return;
        }
        /** Get time objects */
        LocalDateTime startTime = LocalDate.MIN.atTime(LocalTime.of(startHour, startMinute));
        LocalDateTime endTime = LocalDate.MIN.atTime(LocalTime.of(endHour, endMinute));
        /** Print the time diff in minutes */
        if (endTime.isBefore(startTime)) {
          // end on next day
          endTime = endTime.plusDays(1);
        }
        final long minutes = ChronoUnit.MINUTES.between(startTime, endTime);
        System.out.println(minutes);
      }
    }
  }
}
