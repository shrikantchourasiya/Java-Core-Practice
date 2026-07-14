
package Abstractraction;

 abstract class Shape {
   
    abstract void area();

    
    }
 

 class rectangle extends Shape {
    @Override
    void area(){
         int l = 10;
        int b = 20;

        int area = l * b;
        System.out.println("Area of Rectangle is : " + area);
    }
 }

 class circle extends Shape {
    @Override
    void area(){
         int r = 15;
        double area = 3.14 * r * r;
        System.out.println("Area of Circle is : " + area);
    }
 }
public class abstract5 {
    

    public static void main(String[] args) {
    rectangle t1 = new rectangle();
     t1.area();
       

        circle c = new circle();
        c.area(


        );
    
       
    }
}

