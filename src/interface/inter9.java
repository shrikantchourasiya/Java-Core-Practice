// Nested Interface
// Interface resolves Diamond Problem in multiple Inheritance

interface Allmethods{
  
    void m1();
    default void m2(){
 System.out.println("m2 implementation");
 m4();
    }

    static void m3(){
      System.out.println("m3 implementation");
      m5();
    }

    private void m4(){
      System.out.println("m4 implementation");
    }

    private static void m5(){
      System.out.println("m5 implementation");
    }
  
}

class All implements Allmethods{
  public void m1(){
    System.out.println("m1 implementation");
  }
}



public class inter9{
   public static void main(String[] args) {
    
    All a = new All();
    a.m1();
    a.m2();
    Allmethods.m3();
    
    


    
   }
    
}
