package Inheritance;
//Inheritance it is a concept in which child class inherit properties of parent class.
// hierarchical inheritrance
class animal{
    String color;
    animal(String color){
        this.color = color;
    }
    void display() {
        System.out.println("animal is" +color);
        
       
    }}

    class dog extends animal{
        String breed;
        dog(String color, String breed){
            super( color);
            this.breed = breed;
        }

       void  display(){
        System.out.println("dog is : " +color);
        System.out.println("dog is : "+breed);

        }
    }

     class cat extends animal{
        String breed;
        String food;
        
        cat(String color, String breed, String food){
            super( color);
            this.breed= breed;
            this.food = food;
        }

       void  d1(){
        System.out.println("cat is : " +color);
        System.out.println("cat is : "+breed);
        System.out.println("cat  is : "+food);

        }
    }


public class index2 {
    public static void main(String args[]){
        cat a1 = new cat("Blue", "rottweiler", "milk");
        a1.d1();


    }
}
