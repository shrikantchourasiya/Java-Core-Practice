package Inheritance;
 // super class methods
class shri{
    void m1(){
    System.out.println("Parent class method");
   }

} 


public class superEx3 extends shri{
   


    void m1(){
        System.out.println("Child class method"); //Local varible
       
    }
       void m2(){
        this.m1();
        m1();
       super.m1();
        System.out.println("M2 method"); //Local varible
       
    }


    public static void main(String[] args) {
        superEx3 t = new superEx3();
        t.m2();
        
    }
    
}
