package Inheritance;
 // super class constructor
class shri1{
    shri1(int a, int b){
        System.out.println(a + b);
    }
   
} 


public class superEx4 extends shri1{
    superEx4(int a){
        super(100,200);
        System.out.println(a);

    }
   


   


    public static void main(String[] args) {
        superEx4 t = new superEx4(10);
        
    }
    
}

