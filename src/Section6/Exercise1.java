package Section6;

public class Exercise1 {
    public static void main(String[] args) {
        String [] weeks = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
        int i;
        for ( i = 0; i < weeks.length; i++) {
            if (i%2 != 0) {
                System.out.println("Today is " + weeks[i].toUpperCase());
                continue;
            }
//            String upperWeek = i%2 != 0 ? weeks[i] : weeks[i].toUpperCase();
//                    System.out.println("Today is " + upperWeek);
//            break;
            System.out.printf("Today is %s%n", weeks[i]);
        }
//        for (String dayOfTheWeek : weeks)
//            System.out.printf("Today is %s%n", dayOfTheWeek);
    }
}
