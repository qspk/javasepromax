package DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  JDK8
 *  新增 DateTimeFormatter 格式化器对象
 */
public class Test {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        String format = dtf.format(now);
        System.out.println(format);
        String format1 = now.format(dtf);
        System.out.println(format1);

        LocalDateTime parse = LocalDateTime.parse(format,dtf);
        System.out.println(parse);
    }
}
