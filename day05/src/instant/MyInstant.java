package instant;

import java.time.Instant;

/**
 * Instant 时间类
 */
public class MyInstant {
    public static void main(String[] args) {
        Instant now = Instant.now();

        long epochSecond = now.getEpochSecond();
        System.out.println(epochSecond);

        int nano = now.getNano();
        System.out.println(nano);

        Instant instant = now.plusSeconds(60);
        System.out.println(instant);

        Instant instant1 = instant.minusSeconds(60);
        System.out.println(instant1);

        System.out.println(now.equals(instant1));
        System.out.println(instant1.isBefore(instant));
        System.out.println(instant.isAfter(now));


    }
}
