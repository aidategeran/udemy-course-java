package Section5;

import java.math.BigDecimal;

public class CompoundInterest {
    // Balance (Y) = P(1+r)^Y + c[((1+r)^Y-1)/r]
    public static BigDecimal calculate(String principal, String rate, int period, String contribution){
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rate)).pow(period); // (1+r)^Y
        BigDecimal c = a.subtract(BigDecimal.ONE); //((1+r)^Y-1)
        BigDecimal d = c.divide(new BigDecimal(rate)); // ((1+r)^Y-1)/r
        BigDecimal e = d.multiply(new BigDecimal(contribution));
        BigDecimal f = a.multiply(new BigDecimal(principal));
        BigDecimal h = f.add(e);
        return h;
    }

    public static void main(String[] args) {
        BigDecimal balance = CompoundInterest.calculate("10000.00",".08",10,"1000");
        System.out.println(balance);
    }
}
