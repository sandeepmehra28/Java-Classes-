package javaCourseClasses.CustomException;

public class InsufficentFundsBalance extends Exception{
    private double ammount;

    @Override
    public String getMessage() {
        return "you don't have enough money..!";
    }

    public InsufficentFundsBalance(double amount){
         this.ammount=amount;
     }


    public double getAmmount() {
        return ammount;
    }
}
