// overloading categorised in 3 types
// 1. Method overloading 2. constructor overloading 3. operator overloading

// Method overloading
package polymorphism;

import java.util.Scanner;
public class index4 {

     void m1(int a){
    System.out.println(" a = " +a );
        
}

void m1(int a, int b){
     System.out.println(" a = " +a + " b = " +b);
        
}

void m1(int a, int b, int c){
    System.out.println(" a = " +a + " b = " +b + " c = " +c);
        
}



    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        index4 i = new index4();
        System.out.println("Enter the number of arguments (1,2 or 3) : ");
        int arg = sc.nextInt();

        switch (arg){
            case  1 :
                System.out.println("Enter vale of a : ");
                int a= sc.nextInt();
                i.m1(a);
            case 2 :
                 System.out.println("Enter vale of a : ");
                 a= sc.nextInt();
                 System.out.println("Enter vale of b: ");
                int b= sc.nextInt();
              
                i.m1(a,b);

                case 3 :
                 System.out.println("Enter vale of a : ");
                 a= sc.nextInt();
                 System.out.println("Enter vale of b: ");
                 b= sc.nextInt();
                System.out.println("Enter vale of c: ");
               int  c= sc.nextInt();
                
              
                i.m1(a,b,c);
          


                
        }
   
    
        
}

public static void main(int a){
    System.out.println(a);
        
}

public static void main(String a){
    System.out.println(a);
        
}



    
}
