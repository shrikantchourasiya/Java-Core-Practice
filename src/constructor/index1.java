package constructor;

public class index1 {
    //zero Argument Constructor
//     index1(){
//         System.out.println("Zero Argument Constructor");
// }

   // Parametrized constructor

   index1(int a, int b){
    System.out.println("Addition " + (a+b));
   }

void m1(){
    System.err.println("m1");
}
public static void main (String args[]){
    index1 t = new index1(3, 4);
   t.m1();
}

    
}

