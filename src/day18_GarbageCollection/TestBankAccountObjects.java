package day18_GarbageCollection;

public class TestBankAccountObjects {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Ilhan",232321221);
        obj1.deposit(1000);

        obj1.withdraw(100);
        obj1.checkBalance();
    }
}
