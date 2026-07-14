package oops;
import java.util.Scanner;

public class bankApplication {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     bankAccount ct1 = new bankAccount();
     System.out.println("Please enter the Amount Number ");
     int AccNo = sc.nextInt();
     System.out.println(" enter the Account Holder Name ");
     String name= sc.next();
     System.out.println(" enter the initial balance ");
     double  balance = sc.nextDouble();
     ct1.createAccount(AccNo, name, balance);

     int choice;
     System.out.println("=================Bank Details=================");
System.out.println("1. Amount Deposite");
 System.out.println("2. Withdraw Amount");
 System.out.println("3.View Customer Details");
 System.out.println("4.Check current Balance");
 System.out.println("5. Exit");

 choice = sc.nextInt();
 switch (choice) {
    case 1:
        System.out.println("Amount Deposit");
        double amount = sc.nextDouble();
        ct1.amountDeposite(amount);
        break;
    
    case 2:
        System.out.println("Amount Withdraw");
        double amounts = sc.nextDouble();
        ct1.amountwithdraw(amounts);
        break;

    case 3:
        System.out.println("Customer Details");
        ct1.customerDetails();
        break;

    case 4:
        System.out.println("Check Current Balance");
        ct1.checkBalance();
        break;

    case 5 :
        System.out.println("Thank you for banking with us");
        break;

    default :
    System.out.println("Invalid Account");
    break;
 }
     
    } 
}
