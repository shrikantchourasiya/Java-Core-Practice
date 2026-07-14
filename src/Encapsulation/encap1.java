// encapsulation :-  Binding the data in Single Unit/ Wrapping the data.
// It has private data members.
// to access Private members by setter and getter methods.
package Encapsulation;

import  java.util.Scanner;


class m1 {
    private String name;
   public void  setter(String name){
    this.name = name;
    }
  public String getter(){
   return this.name;
   }

}
public class encap1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();

        m1 m = new m1();
        m.setter(name);
        System.out.println(m.getter());
    }
    
}
