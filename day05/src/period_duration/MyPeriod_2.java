package period_duration;

import java.time.*;

/**
 * Period 计算两个日期相差的年数 月数 天数
 */
public class MyPeriod_2 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 2, 28);
        LocalDate end = LocalDate.of(2021, 3, 1);
        LocalDate start1 = LocalDate.of(2021, 2, 28);
        LocalDate end1 = LocalDate.of(2022, 3, 1);

        Period period = Period.between(start, end);

        System.out.println(period.getDays());  //-2
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        LocalDateTime s1 = LocalDateTime.of(2021, 2, 28, 0, 0, 0);
        LocalDateTime e1 = LocalDateTime.of(2022, 3, 1, 0, 0, 0);
        Duration duration = Duration.between(s1, e1);
        System.out.println(duration.toDays());
    }
}
