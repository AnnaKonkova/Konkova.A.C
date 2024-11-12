package templateMethod;

public abstract class Transport {
    // Шаблонный метод
    public final void move() {
        start();
        drive();
        stop();
    }

    protected abstract void drive(); // Конкретный метод, который должен быть реализован в подклассах

    private void start() {
        System.out.println("Транспорт начинает движение.");
    }

    private void stop() {
        System.out.println("Транспорт останавливается.");
    }
}