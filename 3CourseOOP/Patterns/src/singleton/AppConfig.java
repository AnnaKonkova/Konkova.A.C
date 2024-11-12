package singleton;

public class AppConfig {
    // Статическая переменная для хранения единственного экземпляра
    private static AppConfig instance;

    // Глобальные настройки приложения
    private String appName;
    private String version;
    private String databaseUrl;

    // Приватный конструктор для предотвращения создания экземпляров
    private AppConfig() {
        // Инициализация значений по умолчанию
        this.appName = "My Application";
        this.version = "1.0";
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydb";
    }

    // Метод для получения единственного экземпляра
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    // Геттеры и сеттеры для глобальных настроек
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "appName='" + appName + '\'' +
                ", version='" + version + '\'' +
                ", databaseUrl='" + databaseUrl + '\'' +
                '}';
    }
}