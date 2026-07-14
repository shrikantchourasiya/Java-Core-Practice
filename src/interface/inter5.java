// student method study method score class  1 , 2 
interface Flyable  {
   
    void fly_obj();

  }

 class Spacecraft implements Flyable {
    
   
   public void fly_obj(){
    System.out.println("Spacecraft is flyable");

   };
}

class  Airplane implements Flyable{
 public void fly_obj(){
 System.out.println("Airplane is flyable");
 }
}

class Helicopter   implements Flyable{
  public  void fly_obj(){
   System.out.println("Helicopter is flyable");
  }
}
public class inter5{
   public static void main(String[] args) {
    Spacecraft c = new Spacecraft();
   c.fly_obj();

   Airplane c1 = new Airplane();
   c1.fly_obj();

   Helicopter t1 = new Helicopter();
   t1.fly_obj();

    
    
   }
    
}
