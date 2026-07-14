// overloading categorised in 3 types
// 1. Method overloading 2. constructor overloading 3. operator overloading

// 
package polymorphism;

public class index2 {

    void m1(int i){
      System.out.println(" i = " +i);
    }

    void m1(char i){
         System.out.println(" i = " +i);

    }

    void m1(String i){
         System.out.println(" i = " +i);

    }
    public static void main(String args[]){
        index2 i = new index2();
        i.m1(10);
        i.m1('a');
        i.m1("shrikant");


    }
    
}
