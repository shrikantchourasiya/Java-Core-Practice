package oops;
class localVariable {


    void sum(){
        int a = 5;
        int b = 2;
        int c = a + b;
        System.out.println(c);
    }
}

public class index2 {
    public static void main(String args[]){
        localVariable t = new localVariable();
        t.sum();
    }


    
}
