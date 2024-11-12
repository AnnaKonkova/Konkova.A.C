package templateMethod;

public class Train extends Transport {
    @Override
    protected void drive() {
        System.out.println("Поезд движется по железной дороге.");
    }
}