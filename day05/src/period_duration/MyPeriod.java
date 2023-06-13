package period_duration;

import java.time.LocalDate;
import java.time.Period;

/**
 *  Period 计算两个日期相差的年数 月数 天数
 */
public class MyPeriod {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 2, 28);
        LocalDate end = LocalDate.of(2020, 3, 1);

        Period period = Period.between(end, start);

        System.out.println(period.getDays());  //-2
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        System.out.println(period.getChronology());
        System.out.println(period.getUnits());
        System.out.println(period.getClass());


    }
}
