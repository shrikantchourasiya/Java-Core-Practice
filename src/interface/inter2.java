
interface Animal {
   
    void sound();
   
    
}

abstract class re implements Animal {
    abstract void eat();
   
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class cat  extends re{
  public   void sound(){
        System.out.println("Meow Meow");
    }

    void eat(){
        System.out.println("Cat is drinking milk");
    }
}
public class inter2{
   public static void main(String[] args) {
    cat c = new cat();
    c.sound();
    c.eat();
    c.sleep();

    
    
   }
    
}
