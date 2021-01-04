package lab7.Ch2BankTransactions;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Not enough money in your account");
    }
}
