package javaCourseClasses.CustomException;

public class testClass {
    public static void main(String[] args) {
        Bank bank = new Bank(10);
        try{
            bank.withDraw(11);
        }catch (InsufficentFundsBalance e){
            System.out.println(e.getAmmount());
            System.out.println(e);
        }
    }
}
