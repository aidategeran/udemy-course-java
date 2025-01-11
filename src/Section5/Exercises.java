package Section5;

import java.math.BigDecimal;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

public class Exercises {
    public static String moneyFormater(String amount, Locale locale) {
        BigDecimal value = new BigDecimal(amount);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        return formatter.format(value);
    }

    public static void main(String[] args) {
        String amount = "149.32";
        System.out.println("French: " + moneyFormater(amount, Locale.FRANCE));

    }
}


