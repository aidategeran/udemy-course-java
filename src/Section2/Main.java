package Section2;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFirstName("aida");
        System.out.println(p1.getFirstName());

        String myText = "There are two little dogs";
        System.out.println(myText.replace("dogs", "cats"));

        String dateOfBirth = " 2010-05-05 ";
        System.out.format("%s\n",dateOfBirth.strip());

        p1.upperT(" alphabet");

        String myText3 = "12345 Big St., Alphabet City, CA 90210";
        String [] address = myText3.split(" ");
        System.out.println("The building number: "+ address[0]+ " " +
                "The street: "+ address[1] + address[2] + " " +
                "City: "+ address[3] + address[4] + " " +
                "State: "+ address[5] + " " +
                "Postal Code: "+ address[6]);


    }

}