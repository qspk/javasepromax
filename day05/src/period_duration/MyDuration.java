package period_duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class MyDuration {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2020, 2, 28, 12, 12, 12);
        LocalDateTime end = LocalDateTime.of(2020, 3, 1, 11, 12, 12);

        Duration between = Duration.between(end, start);

        System.out.println(between.toNanos());
        System.out.println(between.toMillis());
        System.out.println(between.toMinutes());
        System.out.println(between.toHours());
        System.out.println(between.toDays());
    }
}
