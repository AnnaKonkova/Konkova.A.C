package templateMethod;

public class Car extends Transport {
    @Override
    protected void drive() {
            System.out.println("Автомобиль движется по дороге.");
    }
}