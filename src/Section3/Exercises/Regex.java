package Section3.Exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //String nameOfDogs = "Dark, bark, Lark, stark";
        //String abracadabra = "Abracadabra, Agracadagra";
        String address = "1659 Eagle Grove Ct. apt 521";


        String regex = "(?<numberOfStreet>\\d{1,4})\\s(?<nameOfStreet>\\w+\\b)(?<numberOfApt>\\w+\\s\\d{1,4})";
        //String regex = "\\b" + nameOfDogs + "\\b";
        //String regex = "A[bg]racada[bg]ra";


        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(address);

        if (mat.matches()) {
            System.out.println(mat.group("numberOfStreet"));
            //System.out.println(mat.group("nameOfStreet"));
            //System.out.println(mat.group("numberOfApt"));
        }




    }

}
