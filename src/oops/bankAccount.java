package oops;

public class bankAccount {
    int AccNo;
   String name;
   double balance;
   
   void createAccount(int AccNo, String name, double balance) {
    this.AccNo = AccNo;
    this.name = name;
    this.balance =balance;
}

   void customerDetails(){
    System.out.println("Account Number : " + AccNo);
    System.out.println("Account Holder Name : " +name);
    System.out.println("Account Number : " + balance);
   }

   void amountDeposite(double amount) {
    balance += amount;
    System.out.println("Current Number : " + balance);
   }

   void amountwithdraw(double amount) {
    if (balance >= amount) {
        balance -= amount;
        System.out.println("Current Balance : " + balance);
    }
   }

   void checkBalance() {
    System.out.println("Current Balance : " + balance);
   }
    
}
