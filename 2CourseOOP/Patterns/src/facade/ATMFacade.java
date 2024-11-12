package facade;

public class ATMFacade {
    private ATMService atmService;

    public ATMFacade(Account account) {
        this.atmService = new ATMService(account);
    }

    public void deposit(double amount) {
        atmService.deposit(amount);
    }

    public void withdraw(double amount) {
        atmService.withdraw(amount);
    }

    public double checkBalance() {
        return atmService.checkBalance();
    }
}