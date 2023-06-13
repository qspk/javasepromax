package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date 时间类
 */

public class Test {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        time += 5 * 1000;
        date.setTime(time);
        System.out.println(date);

        Date date1 = new Date(time);
        System.out.println(date1);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a EEE");
        String format = sdf.format(date);
        System.out.println(format);
        String format1 = sdf.format(time);
        System.out.println(format1);


        Date parse = sdf.parse(format);
        System.out.println(parse);


        String s = "yyyy-MM-dd";
        SimpleDateFormat sdf2 = new SimpleDateFormat(s);
        Date parse1 = sdf2.parse(format);
        System.out.println(parse1);

    }
}
