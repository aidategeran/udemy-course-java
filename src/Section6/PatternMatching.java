package Section6;

public class PatternMatching {
    public static void main(String[] args) {
        record Person(String firstName, String lastName, int age) {}
        String var1 = "Hello World";
        Integer var2 = 34;
        String [] var3 = {"hello","world"};
        Person var4 = new Person("Jake", "Johnson", 40);
        Person var5 = new Person("Abe", "Johnson", 40);

        Object obj = var1;

        switch (obj) {
            case null -> System.out.println("It's null");
            case String msg -> System.out.println(msg);
            case Integer num -> System.out.println("Your number is: "+ num);
            case Person p when p.firstName().length() > 3 -> System.out.println("Looks like Jake");
            case String[] arr -> System.out.printf("Looks like an array with %d elements", arr.length);
            default -> System.out.println("Have no idea");
        }


    }
}
