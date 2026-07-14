
package Abstractraction;

 abstract class Animal {
    abstract void sound();

    void sleep(){
        System.out.println("Animal is slepping");
    }
 }

 class dogs extends Animal {

    void sound(){
        System.out.println("Dogs are barking");
    }
 }

 class cats extends Animal {

    void sound(){
        System.out.println("cats are Meow-Meow");
    }
 }
abstract public class abstract4 extends Animal {
    

    public static void main(String[] args) {
       dogs t1 = new dogs();
        t1.sound();
        t1.sleep();

        cats c = new cats();
        c.sound();
        c.sleep();
       
    }
}

