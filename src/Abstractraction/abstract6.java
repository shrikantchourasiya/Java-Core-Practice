
package Abstractraction;
import java.util.Scanner;

 abstract class Employees {
   
    abstract void Salary();

    
    }
 

 class developer extends Employees{
    @Override
    void Salary(){
      
        
        System.out.println("Developer salary is : " + 60000);
    }
 }

 class tester extends Employees {
    @Override
    void Salary(){
         
        System.out.println("tester Salary is : " +40000);
    }
 }
public class abstract6 {
    

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Pls Choose the Employee Designation Number");
      System.out.println("Press 1 for developer");
      System.out.println("Press 2 for tester");

      int num = sc.nextInt();

      switch (num) {
         case 1: System.out.println("Developer Details");
            developer t1 = new developer();
             t1.Salary();
            break;

            case 2: System.out.println("Tester Details");
            tester t2 = new tester();
             t2.Salary();
            break;
      
         default:
            System.out.println("Invalid Employees");
            break;
      }
    
       
    }
}

