package oops;
// method chaining
public class index7 {
    void m1() {
        m2();
        System.out.println("m1");
    }
    void m2() {
        m3();
        System.out.println("m2");
    }
     void m3() {
        
        System.out.println("m3");
    }


    public static void main(String args[]){
        index7 t = new index7();
        t.m1();
        

    }
    
}
