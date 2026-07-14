package constructor;

public class index4{

    
    index4(){
        this(10);   // current class 
        System.out.println("zero argument constructor");
    }
      index4(int a){  
        this(100, 200); 
        System.out.println("one argument constructor");
        System.out.println(a);
    }

      index4(int a, int b){  
        System.out.println("two argument constructor");
        System.out.println(a);
        System.out.println(b);
    }
public static void main(String[] args) {
    index4 i = new index4();
    
}    
}
