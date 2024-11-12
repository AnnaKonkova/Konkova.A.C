package templateMethod;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bicycle = new Bicycle();
        Transport train = new Train();

        System.out.println("Движение автомобиля:");
        car.move();

        System.out.println("\nДвижение велосипеда:");
        bicycle.move();

        System.out.println("\nДвижение поезда:");
        train.move();
    }
}