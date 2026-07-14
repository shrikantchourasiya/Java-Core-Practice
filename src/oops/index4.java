package oops;
class StaticVariable{
    
   
     static void sum(){
       int  a = 4;
        int b = 5;
       int   c;

        c = a + b;
        System.out.println("Sum : " +c);
    
    }
}
public class index4 {
    public static void main(String args[]){
    StaticVariable.sum();

    }
    
}
