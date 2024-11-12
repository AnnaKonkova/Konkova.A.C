package builder;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Room с помощью строителя
        Room livingRoom = new Room.RoomBuilder()
                .setArea(25.0)
                .setWallColor("Синий")
                .setFurniture("Диван, Стол, Стулья")
                .build();

        Room bedroom = new Room.RoomBuilder()
                .setArea(15.0)
                .setWallColor("Зеленый")
                .setFurniture("Кровать, Тумбочка")
                .build();

        // Вывод информации о комнатах
        System.out.println(livingRoom);
        System.out.println(bedroom);
    }
}