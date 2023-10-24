package HomeWork_29;

// Интерфейс платежной системы
public interface PaymentSystem {
    void transferMoney(double amount, String recipient);
    void withdrawMoney(double amount);
    double checkBalance();
}
