package Section6;

public class Exercise4 {
    public static void main(String[] args) {
        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day : days) {
            String meal = switch (day) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                case "Saturday" -> "pizza";
                default -> "unknown meal";
            };
            System.out.println("We eat " + capitalizeWords(meal) + " on " + day);
        }

    }


    public static String capitalizeWords ( String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String [] words = input.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");

            }
        }
        return capitalized.toString().trim();

    }
}
