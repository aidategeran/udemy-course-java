package Section1;

public class Car {
    private String model;
    private String color;
    private int year;
    private int price;

    public Car(String model, String color, int year, int price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main (String[] args) {
        Car car1 = new Car("Car 1", "red", 2015, 100);
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        System.out.println(car1.getPrice());

    }


}
