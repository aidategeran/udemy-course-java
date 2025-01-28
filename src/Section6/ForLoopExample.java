package Section6;

public class ForLoopExample {
    public static void main(String[] args) {
//        for(int counter=0; counter < 10; counter++) {
//            System.out.printf("Counter is %d%n", counter);
//        }
        String[] fruits = {"apple","berry", "orange"};
        for(int counter=0; counter < fruits.length; counter++) {
            System.out.printf("The current fruit is %s%n", fruits[counter]);
        }
    }
}
