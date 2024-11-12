package facade;

public class ATMService {
    private Account account;

    public ATMService(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        if (!account.withdraw(amount)) {
            System.out.println("Withdrawal failed.");
        }
    }

    public double checkBalance() {
        return account.getBalance();
    }
}
