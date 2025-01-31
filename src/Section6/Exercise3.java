package Section6;

public class Exercise3 {

    public static void main(String[] args) {
        String dayOfTheWeekText = System.console().readLine("Write the day number of the week to know menu: ");
        int dayOfTheWeekNum = Integer.parseInt(dayOfTheWeekText);
        String [] meals = {"pot roast", "spaghetti","tacos", "chicken", "meatloaf","hamburgers", "pizza"};
        String [] dayName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


        switch (dayOfTheWeekNum) {
            case 1:
                System.out.printf("We eat %s on %s.%n",meals[0],dayName[0] );
                break;
            case 2:
                System.out.printf("We eat %s on %s.%n",meals[1],dayName[1]);
                break;
            case 3:
                System.out.printf("We eat %s on %s.%n",meals[2],dayName[2]);
                break;
            case 4:
                System.out.printf("We eat %s on %s.%n",meals[3],dayName[3]);
                break;
            case 5:
                System.out.printf("We eat %s on %s.%n",meals[4],dayName[4]);
                break;
            case 6:
                System.out.printf("We eat %s on %s.%n",meals[5],dayName[5]);
                break;
            case 7:
                System.out.printf("We eat %s on %s.%n",meals[6],dayName[6]);
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    public static void toCapitalize (String [] meals ) {

    }





}
