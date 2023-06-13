package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        // 0、获取本地日期和时间对象。
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 1、可以获取日期和时间的全部信息
        int year = ldt.getYear();   //年
        int monthValue = ldt.getMonthValue();   //月 中文
        int dayOfMonth = ldt.getDayOfMonth();
        int dayOfYear = ldt.getDayOfYear();
        DayOfWeek dayOfWeek = ldt.getDayOfWeek();
        int value = dayOfWeek.getValue();
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        int nano = ldt.getNano();  //纳秒

        // 2、修改时间信息：
        // withYear withMonth withDayOfMonth withDayOfYear withHour
        // withMinute withSecond withNano
        LocalDateTime ldt2 = ldt.withYear(2024);
        LocalDateTime ldt3 = ldt.withDayOfMonth(12);

        // 3、加多少:
        // plusYears  plusMonths plusDays plusWeeks plusHours
        // plusMinutes plusSeconds plusNanos
        LocalDateTime ldt4 = ldt.plusYears(-2);
        LocalDateTime ldt5 = ldt.plusDays(10);

        // 4、减多少：
        // minusDays minusYears minusMonths minusWeeks minusHours
        // minusMinutes minusSeconds minusNanos
        LocalDateTime ldt6 = ldt.minusYears(-3);
        LocalDateTime ldt7 = ldt.minusHours(10);

        // 5、获取指定日期和时间的LocalDateTime对象：
        // public static LocalDateTime of
        // (int year, Month month, int dayOfMonth, int hour,
        //  int minute, int second, int nanoOfSecond)
        LocalDateTime ldt8 = LocalDateTime.of(2099, 12, 12, 12, 12, 12);
        LocalDateTime ldt9 = LocalDateTime.of(2099, 12, 12, 12, 12, 12);

        // 6、 判断2个日期、时间对象，是否相等，在前还是在后： equals、isBefore、isAfter

        System.out.println(ldt8.equals(ldt9));
        System.out.println(ldt6.isAfter(ldt7));
        System.out.println(ldt4.isBefore(ldt5));

        // 7、可以把LocalDateTime转换成LocalDate和LocalTime
        // public LocalDate toLocalDate()
        // public LocalTime toLocalTime()
        // public static LocalDateTime of(LocalDate date, LocalTime time)
        LocalDate localDate = ldt.toLocalDate();
        LocalTime localTime = ldt.toLocalTime();
        LocalDateTime ldt10 = LocalDateTime.of(localDate, localTime);

    }
}
