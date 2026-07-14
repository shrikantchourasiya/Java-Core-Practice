package Inheritance;
//Inheritance it is a concept in which child class inherit properties of parent class.
// multi level  inheritrance
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

     class puppy extends dog{
        String food;
        
        puppy(String color, String breed, String food){
            super(color,breed);
            this.food = food;
        }
      @Override
       void  display(){
        System.out.println("puppy is : " +color);
        System.out.println("puppy is : "+breed);
        System.out.println("puppy  is : "+food);

        }
    }


public class index3 {
    public static void main(String args[]){
        puppy a1 = new puppy("Blue", "rottweiler", "milk");
        a1.display();


    }
}
