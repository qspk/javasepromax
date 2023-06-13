package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 三天打鱼两天晒网
 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        String startDateStr = "1990-01-01";

        String endDateStr = "2023-06-10";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        long startDate = sdf.parse(startDateStr).getTime();
        long endDate = sdf.parse(endDateStr).getTime();
        int dayNum = (int) ((endDate - startDate) / (1000 * 60 * 60 * 24));//默认从0点开始，不需要加1
        int resultDate = dayNum % 5;
        if (resultDate == 1 || resultDate == 2 || resultDate == 0) {
            System.out.println(endDateStr + " 在打渔");
        } else if (resultDate == 4 || resultDate == 3) {
            System.out.println(endDateStr + " 在晒网");
        }
    }
}

