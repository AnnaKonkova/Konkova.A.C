package builder;
 public class Room {
    private final double area; // Площадь
    private final String wallColor; // Цвет стен
    private final String furniture; // Мебель

    // Конструктор класса Room
    private Room(RoomBuilder builder) {
        this.area = builder.area;
        this.wallColor = builder.wallColor;
        this.furniture = builder.furniture;
    }

    // Геттеры
    public double getArea() {
        return area;
    }

    public String getWallColor() {
        return wallColor;
    }

    public String getFurniture() {
        return furniture;
    }

    // Паттерн "Строитель"
    public static class RoomBuilder {
        private double area; // Площадь
        private String wallColor; // Цвет стен
        private String furniture; // Мебель

        public RoomBuilder setArea(double area) {
            this.area = area;
            return this;
        }

        public RoomBuilder setWallColor(String wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public RoomBuilder setFurniture(String furniture) {
            this.furniture = furniture;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", wallColor='" + wallColor + '\'' +
                ", furniture='" + furniture + '\'' +
                '}';
    }
}