package Section6;

public class Exercise2 {
    public static void main(String[] args) {
//        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        int i = 0;

        // While loop
//        while ( i<= weeks.length-1) {
//            System.out.println("Today is " + weeks[i]);
//            i++;
//        }

        // Do while loop
//        do {
//            System.out.println("Today is " + weeks[i]);
//            i++;
//        } while (i <= weeks.length-1);


        // Enhanced for loop
//        for (String dayOfTheWeek : weeks)
//            if (dayOfTheWeek.equals("Monday")) {
//                System.out.println("We eat spaghetti on " + dayOfTheWeek);
//            } else if (dayOfTheWeek.equals("Tuesday")) {
//                System.out.println("We eat tacos on " + dayOfTheWeek);
//            } else if (dayOfTheWeek.equals("Wednesday")) {
//                System.out.println("We eat chicken on " + dayOfTheWeek);
//            } else if (dayOfTheWeek.equals("Thursday")) {
//                System.out.println("We eat meatloaf on " + dayOfTheWeek);
//            } else if (dayOfTheWeek.equals("Friday")) {
//                System.out.println("We eat hamburgers on " + dayOfTheWeek);
//            } else if (dayOfTheWeek.equals("Saturday")) {
//                System.out.println("We eat pizza on " + dayOfTheWeek);
//            } else if (dayOfTheWeek.equals("Sunday")) {
//                System.out.println("We eat pot roast on " + dayOfTheWeek);
//            }

        // Switch case
        String dayOfTheWeekText = null;
        dayOfTheWeekText = System.console().readLine("Please put a number from 1 to 7 to know the day name of the week: ");
        int dayOfTheWeekNum = Integer.parseInt(dayOfTheWeekText);
        String dayName;
        switch (dayOfTheWeekNum) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
            default:
                dayName = "Invalid day";
        }
        System.out.println(dayName);







    }

}
