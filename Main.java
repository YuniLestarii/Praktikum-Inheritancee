//Yuni Lestari 20220040006 (TI22C)
public class Main {
    public static void main(String[] args) {
        // Testing Account class
        Account account = new Account(1000);
        System.out.println("Saldo: " + account.getBalance());
        account.deposit(500);
        System.out.println("Saldo setelah deposit: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Saldo setelah penarikan: " + account.getBalance());

        // Testing SavingAccount class
        SavingAccount savingAccount = new SavingAccount(2000, 0.05);
        System.out.println("\nSaldo Rekening Tabungan: " + savingAccount.getBalance());

        // Testing CheckingAccount class
        CheckingAccount checkingAccount = new CheckingAccount(3000, 1000);
        System.out.println("\nSaldo Rekening Checking: " + checkingAccount.getBalance());
        checkingAccount.withdraw(4000);
        System.out.println("Saldo setelah penarikan: " + checkingAccount.getBalance());
    }
}
