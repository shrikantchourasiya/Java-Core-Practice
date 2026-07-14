package constructor;

public class index2 {

    int a = 5; // instance variable
    int b = 4;

    void sum(int a , int b){   // local avriable
        System.out.println(a + b);
        System.out.println(this.a + this.b); // current class variable
    }
public static void main(String[] args) {
    index2 i = new index2();
    i.sum(2,5);
}    
}

