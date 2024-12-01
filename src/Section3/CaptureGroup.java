package Section3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroup {
    public static void main(String[] args) {
        String regex = "(1[-.,\\s]?)?(\\d{3}[-.,\\s])(\\d{3}[-.,\\s])\\d{4}";
        String phoneNumber = "1.232.346.6577";
        System.out.println(phoneNumber.matches(regex));

        //system.out.println("1.232.346.6577".matches("(1[-.,\\s]?)?(\\d{3}[-.,\\s]){1,2}\\d{4}"));

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phoneNumber);

        if (m.matches()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));

        }
    }
}
