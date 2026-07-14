package constructor;

public class mobile{

    
    mobile(){
        this(10);   // current class 
        System.out.println("zero argument constructor");
    }
      mobile  (int a){  
        this(100, 200); 
        System.out.println("one argument constructor");
        System.out.println(a);
    }

      mobile (int a, int b){  
        System.out.println("two argument constructor");
        System.out.println(a + b);
        System.out.println(b);
    }
public static void main(String[] args) {
    index4 i = new index4();
    
}    
}
