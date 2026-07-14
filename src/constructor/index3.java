package constructor;

public class index3 {

    
    void m1(){
        this.m2();   // current class method
        System.out.println("m1 method");
    }
     void m2(){   // local avriable
        System.out.println("m2 method");
    }
public static void main(String[] args) {
    index3 i = new index3();
    i.m1();
}    
}
