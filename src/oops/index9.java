package oops;
public class index9 {
     int a= 5;
     int b = 6;
     static String s = "abc";
     void sum(int i, int j) {
        int x = i+j;
        System.out.println(x);
    }
  void Addition() {
      int c = a+b;
       System.out.println("Sum : "+c);
    }
    static void Sub(int l, int k) {
        int m = l - k;
        
        System.out.println("Sub:" +m);
    }
    static void word() {
        
      System.out.println("word :" +s);
    }



    public static void main(String args[]){
        index9 t = new index9();
        t.sum(2,3);
        t.Addition();
        Sub(4,3);
        word();

         

    }
    
}
