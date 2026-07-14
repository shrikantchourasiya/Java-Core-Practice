// student method study method score class  1 , 2 
interface Shape  {
   
    void Area();

  }

 class Rectangle implements Shape {
    
   
   public  void Area(){
        System.out.println("A");
    }
}

class  Circle  implements Shape{
 public  void Area(){
        System.out.println("A");
    }
}

class  Triangle implements Shape{
  public  void Area(){
        System.out.println("A");
    }
}
public class inter4{
   public static void main(String[] args) {
    Rectangle c = new Rectangle();
   c.Area();

   Circle c1 = new Circle();
   c1.Area();

   Triangle t1 = new Triangle();
   t1.Area();

    
    
   }
    
}
