// overloading categorised in 3 types
// 1. Method overloading 2. constructor overloading 3. operator overloading

// 
package polymorphism;

public class index1 {

    void m1(int a){
      System.out.println(" a = " +a );
    }

    void m1(int a, int b){
         System.out.println(" a = " +a + " b = " +b);

    }

    void m1(int a , int b , int c){
         System.out.println(" a = " +a + " b = " +b + " c = " +c);

    }
    public static void main(String args[]){
        index1 i = new index1();
        i.m1(10);
        i.m1(10,20);
        i.m1(10,20,30);


    }
    
}
