
//   constructor overloading

// 
package polymorphism;


public class index6 {
     index6(int a){
        System.out.println(a);
    }
        
     index6(int a, int b){
         System.out.println(a+b);
    }
        
     index6(int a, int b, int c){
         System.out.println(a+b+c);
    }
        
 public static void main(String args[]){
   index6 i = new index6(10);
   index6 i1 = new index6(10,20);
   index6 i2 = new index6(10,20, 30);
   




    
}}
