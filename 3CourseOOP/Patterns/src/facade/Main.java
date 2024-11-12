package facade;

public class Main {
    public static void main(String[] args) {
        // Создаем банковский счет с начальным балансом
        Account account = new Account("123456789", 1000.00);

        // Создаем фасад для работы с банкоматом
        ATMFacade atmFacade = new ATMFacade(account);

        // Проверяем баланс
        System.out.println("Current Balance: " + atmFacade.checkBalance());

        // Пополняем счет
        atmFacade.deposit(500.00);
        System.out.println("New Balance: " + atmFacade.checkBalance());

        // Снимаем наличные
        atmFacade.withdraw(200.00);
        System.out.println("Balance after withdrawal: " + atmFacade.checkBalance());

        // Пытаемся снять больше, чем на счете
        atmFacade.withdraw(1500.00);
    }
}