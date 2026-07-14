
package Abstractraction;
import java.util.Scanner;

 abstract class Bank {
   
    abstract double fd();

    
    }
 

  class sbi extends Bank {
    @Override
    double fd(){
      return 6.5;
         
        
        
    }
 }

 class  hdfc extends Bank {
    @Override
    double  fd(){
      return 7.5;
      

         
       
    }
 }
public class abstract7 {
    

    public static void main(String[] args) {
     
        
            sbi t1 = new sbi();
             System.out.println("Bank Details"+t1.fd());
            
          

            
            hdfc t2 = new hdfc();
             System.out.println("Bank Details"+t2.fd());
            
            
      
        
      
    
       
    }
}

