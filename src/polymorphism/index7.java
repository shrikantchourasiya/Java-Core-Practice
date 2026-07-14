
//   constructor overloading

// 
package polymorphism;
import java.util.Scanner;

public class index7 {
     index7(String EmpName, double Salary){
        System.out.println("Emplyee_Name" +EmpName );
        System.out.println("Salary : "+Salary );
     }   
     index7(String EmpName, double Salary, double bonus){
          System.out.println("Emplyee_Name" +EmpName );
        System.out.println("Salary(included salary + bonus) : "+(Salary + bonus) );
        
    }
        
     index7(String EmpName, double Salary, double bonus, double incentive ){
          System.out.println("Emplyee_Name" +EmpName );
        System.out.println("Salary(included salary + bonus) : "+(Salary + bonus) );
        System.out.println("Salary(included bonus+ inc.) : "+(Salary+ bonus + incentive));
    }
        
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter number the Arguments : 2|3|4");
    int numArg = sc.nextInt();

    switch(numArg){
        case 2: System.out.println("Employee Detail = name and Salary");
        System.out.println("Please Enter the Employee Name");
        String name = sc.next();
        System.out.println("Please Enter the Salary");
        double salary = sc.nextDouble();
        index7 i = new index7(name, salary);
        break;

        case 3: System.out.println("Employee Detail = name, Salary and Bonus");
        System.out.println("Please Enter the Employee Name");
         name = sc.next();
        System.out.println("Please Enter the Salary");
         salary = sc.nextDouble();
         System.out.println("Please Enter the Bonus");
        double Bonus = sc.nextDouble();
        index7 i1 = new index7(name, salary,Bonus);
        break;

         case 4: System.out.println("Employee Detail = name, Salary, Bonus and incentive");
        System.out.println("Please Enter the Employee Name");
         name = sc.next();
        System.out.println("Please Enter the Salary");
         salary = sc.nextDouble();
         System.out.println("Please Enter the Bonus");
         Bonus = sc.nextDouble();
        System.out.println("Please Enter the incentive");
        double incetive = sc.nextDouble();   
index7 i2 = new index7(name, salary,Bonus, incetive);

default:
    System.out.println("Invalid Argument");
}
   




    
}}
