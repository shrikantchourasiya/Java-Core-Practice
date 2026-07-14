

package Encapsulation;

import  java.util.Scanner;


class Student {
    private String Name;
    private int Roll_No ;
   public void  setName(String Name ){
    this.Name = Name;
    }
  public String getName(){
   return Name;
   }

    public void  setRoll_No(int Roll_No ){
    this.Roll_No = Roll_No;
    }

     public int getRoll_No(){
   return Roll_No;
   }
}
public class encap2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();

        System.out.println("Enter the roll number");
        int rollNo = sc.nextInt();

        Student m = new Student();
        m.setName(name);
        System.out.println(m.getName());
        m.setRoll_No(rollNo);
        System.out.println(m.getRoll_No());
    }
    
}
