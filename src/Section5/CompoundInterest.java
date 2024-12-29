package Section5;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterest {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance();

    // Balance (Y) = P(1+r)^Y + c[((1+r)^Y-1)/r]
    public static BigDecimal calculate(String principal, String rate, int period, String contribution) throws ParseException {
        String rateAsPercent = percentFormatter.parse(rate).toString();
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(period); // (1+r)^Y
        BigDecimal c = a.subtract(BigDecimal.ONE); //((1+r)^Y-1)
        BigDecimal d = c.divide(new BigDecimal(rateAsPercent)); // ((1+r)^Y-1)/r
        BigDecimal e = d.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString()));
        BigDecimal f = a.multiply(new BigDecimal(moneyFormatter.parse(principal).toString()));
        BigDecimal h = f.add(e);
        return h;
    }

    public static void main(String[] args) throws ParseException {
        BigDecimal balance = CompoundInterest.calculate("$25,300.00","8%",10,"$7,500");
        System.out.println(moneyFormatter.format(balance));
    }
}
