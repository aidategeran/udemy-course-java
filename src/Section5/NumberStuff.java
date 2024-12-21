package Section5;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class NumberStuff {
    public static void main(String[] args) {
        System.out.println(new BigDecimal("3.34456").add(new BigDecimal("4.56776878")));
        System.out.println(new BigDecimal("4.56789").multiply(new BigDecimal("3.456778678")));
        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal("3.4578").divide(new BigDecimal("1.23345"), mc));
        System.out.println(new BigDecimal("0.34567").sqrt(mc));
        System.out.println(new BigDecimal("7").max(new BigDecimal("13")));
        System.out.println(new BigDecimal("-7").abs());

    }
}
