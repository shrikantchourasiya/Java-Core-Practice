// Nested Interface
// Interface resolves Diamond Problem in multiple Inheritance

interface father {
  
    void property();
  
}
 interface  mother {
        void love();
 }

 interface siblings {
  void fun();
 }

class family implements father , mother,siblings{
  public void property(){
    System.out.println("Father distributed their properties among children");
  }

  public void love(){
    System.out.println("Mother spread their loves among children");
  }

  public void fun(){
    System.out.println("Hurray ! Enjoy rain with fun");
  }
}



public class inter8{
   public static void main(String[] args) {
    
    family f = new family();
    f.property();
    f.love();
    f.fun();

    


    
   }
    
}
