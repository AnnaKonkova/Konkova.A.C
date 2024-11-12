package templateMethod;

public class Bicycle extends Transport {
    @Override
    protected void drive() {
        System.out.println("Велосипед движется по велодорожке.");
    }
}