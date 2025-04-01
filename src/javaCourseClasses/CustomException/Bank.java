package javaCourseClasses.CustomException;

public class Bank {
    private double balance;



    public Bank(double amount) {
        balance = amount;
    }
    public void withDraw(double amount) throws InsufficentFundsBalance {
        if(amount>balance){
            throw new InsufficentFundsBalance(amount);
        }
        balance-=amount;
    }
}
