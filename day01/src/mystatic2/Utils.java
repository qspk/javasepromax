package mystatic2;

import java.util.Random;

public class Utils {
    private Utils() {

    }

    public static String createCode(int n) {
        //1.定义一个字符串，用来记录产生的验证码
        String code = "";

        //2.验证码是由所有的大写字母、小写字母或者数字字符组成
        //这里先把所有的字符写成一个字符串，一会从字符串中随机找字符
        String data = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKMNOPQRSTUVWXYZ";

        //3.循环n次，产生n个索引,再通过索引获取字符
        Random r = new Random();
        for(int i=0; i<n; i++){
            int index = r.nextInt(data.length());
            char ch = data.charAt(index);
            //4.把获取到的字符，拼接到code验证码字符串上。
            code+=ch;
        }

        //最后返回code,code的值就是验证码
        return code;
    }
}
