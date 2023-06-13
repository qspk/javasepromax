package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        // 目标：完成秒杀案例。
        // 1、把开始时间、结束时间、小贾下单时间、小皮下单时间拿到程序中来。
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:57";

        //2. 把字符串的时间解析为日期格式
        String s = "yyyy年MM月dd日 HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(s);

        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date xjDate = sdf.parse(xj);
        Date xpDate = sdf.parse(xp);

        //3. 获取日期毫秒值形式 用以比较
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long xjTime = xjDate.getTime();
        long xpTime = xpDate.getTime();

        if (xjTime >= startTime && xjTime <= endTime) {
            System.out.println("小贾秒杀成功");
        } else {
            System.out.println("小贾秒杀失败");
        }
        if (xpTime >= startTime && xpTime <= endTime) {
            System.out.println("小皮秒杀成功");
        } else {
            System.out.println("小皮秒杀失败");
        }
    }
}

/**
 *
 */