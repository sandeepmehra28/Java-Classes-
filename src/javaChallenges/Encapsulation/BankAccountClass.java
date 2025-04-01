package javaChallenges.Encapsulation;
//Define a BankAccount class with private attributes like
//accountNumber, accountHolderName, and balance. Provide
//public methods to deposit and withdraw money, ensuring that
//these methods don't allow illegal operations like withdrawing
//more money than the current balance.
 class BankAccountClass {
   private long accountNumber;
   private String accountHolderName;
   private double accountBalance;

   public BankAccountClass(String accountHolderName, long accountNumber) {
      this.accountHolderName = accountHolderName;
      this.accountNumber = accountNumber;
   }

   public void depositMoney(double money){
      if(money<=0){
         System.out.println("invalid deposit..!");
      }else {
         accountBalance += money;
      }
   }
   public double withdrawMoney(double money){
       if (money<=0) {
           System.out.println("invalid withdraw..!");
       } else if (accountBalance>=money) {
         accountBalance-=money;
      }else {
         money=accountBalance;
         accountBalance=0;
      }
      return money;
   }
}
