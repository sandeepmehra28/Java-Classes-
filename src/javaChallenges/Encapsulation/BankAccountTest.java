package javaChallenges.Encapsulation;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccountClass p1 = new BankAccountClass("sandeep",11220089);
        p1.depositMoney(5000);
        System.out.println(p1.withdrawMoney(1000));

    }
}
