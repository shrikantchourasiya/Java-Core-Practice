package Inheritance;
//Inheritance it is a concept in which child class inherit properties of parent class.
// single inheritance
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

public class index1 {
    public static void main(String args[]){
        dog a1 = new dog("Blue", "rottweiler");
        a1.display();


    }
}
