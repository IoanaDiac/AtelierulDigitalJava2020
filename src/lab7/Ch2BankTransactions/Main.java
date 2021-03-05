package lab7.Ch2BankTransactions;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(2000, "ba1");
        BankAccount ba2 = new BankAccount(4000, "ba2");
        BankAccount ba3 = new BankAccount(2500, "ba3");

        TransactionThread tt = new TransactionThread("t1", ba1, ba2, 2000);
        TransactionThread tt2 = new TransactionThread("t1", ba1, ba3, 1900);

        tt.start();
        tt2.start();
    }
}