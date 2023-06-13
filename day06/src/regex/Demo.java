package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 信息爬取
 */
public class Demo {
    public static void main(String[] args) {
        String data = " 来黑马程序员学习Java，\n" +
                "        电话：1866668888，18699997777\n" +
                "        或者联系邮箱：boniu@itcast.cn，\n" +
                "        座机电话：01036517895，010-98951256\n" +
                "        邮箱：bozai@itcast.cn，\n" +
                "        邮箱：dlei0009@163.com，\n" +
                "        热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";

        String regex = "(1[3-9]\\d{9})|(0\\d{2,9}-?[1-9]\\d{4,19})|(\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2})" +
                "|(400-?\\d{3,7}-?[1-9]\\d{2,9})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            String mes = matcher.group();
            System.out.println(mes);
        }
    }
}
