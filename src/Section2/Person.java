package Section2;

public class Person {
   private String firstName;
   private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void upperT(String myText) {
        myText = myText.replace("t","T");
        System.out.println(myText.strip());
    }




}