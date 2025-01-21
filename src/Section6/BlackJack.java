package Section6;

public class BlackJack {
    public static void main(String[] args) {
        String card = "3";
        int currentTotalValue = 15;

        int currentValue =  switch (card) {
            case "jack", "queen", "king" -> 10;
            case "ace" -> {
                if (currentTotalValue < 11) {
                    yield 11;
                } else {
                    yield 1;
                }

            }
            default -> Integer.parseInt(card);

        };

        System.out.printf("Current Card Value: %d%n", currentValue);
        System.out.printf("Total value: %d%n", currentTotalValue + currentValue);
    }
}
