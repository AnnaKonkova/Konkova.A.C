package singleton;

public class Main {
    public static void main(String[] args) {
        // Получаем единственный экземпляр AppConfig
        AppConfig config = AppConfig.getInstance();

        // Выводим текущие настройки
        System.out.println("Initial Config: " + config);

        // Изменяем настройки
        config.setAppName("My Updated Application");
        config.setVersion("1.1");
        config.setDatabaseUrl("jdbc:mysql://localhost:3306/updateddb");

        // Выводим обновленные настройки
        System.out.println("Updated Config: " + config);

        // Получаем другой экземпляр AppConfig и проверяем, что это тот же самый объект
        AppConfig anotherConfig = AppConfig.getInstance();
        System.out.println("Another Config: " + anotherConfig);

        // Проверяем, что оба экземпляра равны
        System.out.println("Are both instances equal? " + (config == anotherConfig));
    }
}