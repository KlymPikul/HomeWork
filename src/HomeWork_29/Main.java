package HomeWork_29;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        System.out.println("Баланс на банковском счете: " + bankAccount.checkBalance());
        bankAccount.transferMoney(500, "1234567890");
        System.out.println("Баланс на банковском счете после перевода: " + bankAccount.checkBalance());
        bankAccount.withdrawMoney(200);
        System.out.println("Баланс на банковском счете после снятия: " + bankAccount.checkBalance());

        ElectronicWallet electronicWallet = new ElectronicWallet(500);
        System.out.println("Баланс в электронном кошельке: " + electronicWallet.checkBalance());
        electronicWallet.transferMoney(200, "Klym Pikul");
        System.out.println("Баланс в электронном кошельке после перевода: " + electronicWallet.checkBalance());
        electronicWallet.withdrawMoney(100);
        System.out.println("Баланс в электронном кошельке после снятия: " + electronicWallet.checkBalance());
    }
}
