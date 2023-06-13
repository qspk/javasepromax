package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        BigDecimal a1 = BigDecimal.valueOf(0.1);
        BigDecimal a2 = BigDecimal.valueOf(0.3);

        BigDecimal c1 = a1.add(a2);
        System.out.println(c1);

        BigDecimal c2 = a1.subtract(a2);
        System.out.println(c2);

        BigDecimal c3 = a1.multiply(a2);
        System.out.println(c3);

        BigDecimal c4 = a1.divide(a2, 3, RoundingMode.HALF_UP);
        System.out.println(c4);

    }
}
