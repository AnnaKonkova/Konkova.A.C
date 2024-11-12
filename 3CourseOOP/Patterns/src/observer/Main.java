package observer;

import observer.projects.TaskManager;
import observer.user.User;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        User user1 = new User("Аня");
        User user2 = new User("Мария");

        taskManager.subscribe(user1);
        taskManager.subscribe(user2);

        taskManager.addTask("Разработайте программу для уведомления о поступлении новых задач в системе управления проектами,\n" +" где пользователи могут подписаться на уведомления о назначении задач.\n" +
                "\n");
        taskManager.addTask("Разработать интерфейс пользователя");
    }
}
