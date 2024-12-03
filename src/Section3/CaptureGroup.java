package Section3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroup {
    public static void main(String[] args) {
        String regex = """
        #This is my regex to parse the parts of a phone number
        (?:(?<countryCode>\\d{1,2})[-.,\\s]?)? #Get's country code
        (?:(?<areaCode>\\d{3})[-.,\\s]?) #Cet's area code
        (?:(?<exchange>\\d{3})[-.,\\s]?)
        (?<lineNumber>\\d{4})""";
        String phoneNumber = "12.232.346.6577";
        System.out.println(phoneNumber.matches(regex));

        //system.out.println("1.232.346.6577".matches("(1[-.,\\s]?)?(\\d{3}[-.,\\s]){1,2}\\d{4}"));

        Pattern p = Pattern.compile(regex, Pattern.COMMENTS);
        Matcher m = p.matcher(phoneNumber);

        if (m.matches()) {
            System.out.format("Country code: %s\n",m.group("countryCode"));
            System.out.format("Area code: %s\n", m.group("areaCode"));
            System.out.format("Exchange: %s\n",m.group("exchange"));
            System.out.format("Line number: %s\n",m.group("lineNumber"));

        }


    }
}
