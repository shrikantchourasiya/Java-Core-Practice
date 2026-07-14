package oops;
class instanceVariable{
    int  a= 5;
    int  b = 4;
    int  c ;

    void sum(){
        c = a+b;
        System.out.println("Sum : " +c);
    }

}
public class index3 {
    public static void main(String args[]) {
         instanceVariable t = new instanceVariable();
         t.sum();
    }
}
