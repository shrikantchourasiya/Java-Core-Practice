// 1. default constructor
// 2. user defined constructor
//  zero argument constructor
//  Parametrized constructor

// this keyword
//  current class variable
//  current class methods
//  current class constructor


package constructor;

public class constructor {
    
 int a = 4;
 int b = 5;
 static int  c =  30;

   void m1(){
    System.out.println("Instance method without parameters");
    System.out.println("Sum : " + (a + b));
    System.out.println(c);
   }

void m2(int a, int b){

   System.out.println("Instance method with parameters " );
      System.out.println(a + b);
}

static void m3(){
    System.out.println("static method" );
      System.out.println(c);
}

static void m4(int a , int b){
    System.out.println("Parameter static method");
    System.out.println(a - b);
}

constructor(int a){
    System.out.println(a);

}
 constructor(int a , int b){
    System.out.println(a + b);
 }



public static void main (String args[]){
    constructor c = new constructor(3);
    c.m1();
    c.m2(2,5);
    m3();
    m4(4,5);
    constructor c1 = new constructor(3, 2);
     
   
   
}

    
}
