// Abstract class :  it hides the implementation and only shows the interface to the user.
// Abstraction : Abstracttion is the process of hiding implementation details and showing only functionality to the user.
// Here we can achieve abstraction with the help of : 
//     a. Abstract class
//     b. Interface 

// a. Abstract class : 
// -------------------
// 1. For making any class as an abstract, we need to put abstract keyword followed by class name.
// 2. In java, its not mandatory to have abstract method to make any class as an abstract class. 
// 3. Abstract class cannot be instantiated, which means we cannot create object of abstract class.
// 4. Abstract class can contains :    
//     i. abstract method(method whose definition part is absent)
//     ii. concrete method(method whose definition part is present)
//     iii. constructor 
// 5. Abstract class provides reference to the child class, where child 
// class may create there own object with respect to that specific abstract class.
// 6. If any child class extends abstract parent class(containing abstract method), 
// then in that case its mandatory for the child class to give the implementation 
// of that specific abstract method otherwise it will gives you compilation error. 
// 7. If we want to achieve some functionality forcefully from child class then in that case we can create abstract method.
// 8. With the help of abstract class we can achieve 0 to 100% abstraction
// 9. syntax :  abstract class Demo{ // abstract class
//                 abstract void display(); // abstract method
//              }   
package Abstractraction;

abstract class Test1 {
    abstract  int  m1();  // abstarct method
   abstract boolean m2();  // abstarct method
  
}

class abstract1 extends Test1{
    
    int m1() {
        System.out.println("m1 method");
        return 100;
    }

    boolean m2() {
        System.out.println("m2 method");
        return true;
    }

    public static void main(String[] args) {
       abstract1 t = new abstract1();
       int a = t.m1();
       System.out.println(a);
       boolean b = t.m2();
       System.out.println(b);
    }
}

