package Inheritance;
// super class variable
class parent{
    int a = 1;
    int b = 2;
}

public class superEx2 extends parent {
    int a = 4;    //child instance 
    int b = 6;


    void m1(int a , int b){
        System.out.println(a+b); //Local varible
        System.out.println(this.a+this.b); 
        System.out.println(super.a+super.b);
    }

    public static void main(String[] args) {
        superEx2 t = new superEx2();
        t.m1(1000,2000 );
        
    }
    
}
