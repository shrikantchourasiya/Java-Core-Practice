package Inheritance;
 // super class constructor
class Parent {
    void display() {
        System.out.println("Parent Display");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child Display");
    }

    void show() {
        System.out.println("Child Show");
    }
}

public class Main {
    public static void main(String[] args) {

        Parent p = new Child();

        p.display();
        
    }
}