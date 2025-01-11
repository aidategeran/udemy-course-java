package Section5;

public class GenerateSumOfNumbers {

    public static int next(){
        int randomNumber1 = (int)(Math.random()*10);
        System.out.println(randomNumber1);
        int randomNumber2 = (int)(Math.random()*10);
        System.out.println(randomNumber2);
        int sumOfNumbers = randomNumber1 + randomNumber2;
        System.out.println(sumOfNumbers);
        return sumOfNumbers + (int)(Math.random()*10);
    }

    public static void main(String[] args) {
        System.out.println(next());

    }
}
