package Section3.Exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String nameOfDogs = "Dark, bark, Lark, stark";

        String regex = "\\b" + nameOfDogs + "\\b";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(nameOfDogs);

        if (mat.find()) {
            System.out.println(mat.group());

        }


    }

}
