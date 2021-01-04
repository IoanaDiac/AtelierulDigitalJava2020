package lab7.Ch2BankTransactions;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("ba1", 2000);
        BankAccount ba2 = new BankAccount("ba2", 4000);
        BankAccount ba3 = new BankAccount("ba3", 2500);

        System.out.println("before:");
        System.out.println(ba1);
        System.out.println(ba2);
        System.out.println(ba3);

        TransactionThread tt = new TransactionThread("T1", ba1, ba2, 300);
        TransactionThread tt2 = new TransactionThread("T2", ba2, ba3, 200);

        //start transacting
        tt.start();
        tt2.start();

        //wait for transfers to be completed
        //tt.join();
        //tt2.join();

        System.out.println("after:");
        System.out.println(ba1);
        System.out.println(ba2);
    }
    }

