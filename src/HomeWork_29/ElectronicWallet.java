package HomeWork_29;

// Класс электронного кошелька
public class ElectronicWallet implements PaymentSystem {
    private double balance;

    public ElectronicWallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void transferMoney(double amount, String recipient) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Переведено " + amount + " на счет " + recipient);
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Снято " + amount + " со счета.");
        } else {
            System.out.println("Недостаточно средств для снятия.");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

