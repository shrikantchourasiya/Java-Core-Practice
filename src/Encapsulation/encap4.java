

package Encapsulation;

import  java.util.Scanner;


class Employee {
    private String userName;
    private int Password ;
   public void  setuserName(String userName ){
    this.userName = userName;
    }
  public String getuserName(){
   return userName;
   }

    public void  setPassword(int Password ) {
       
            this.Password = Password;
       }

     public int getPassword(){
   return Password;
   }
}


public class encap3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username");
        String name = sc.next();

        System.out.println("Enter the Password");
        int password = sc.nextInt();

        Employee m = new Employee();
        m.setName(name);
        System.out.println(m.getName());
        m.setRoll_No(rollNo);
        System.out.println(m.getRoll_No());
    }
    
}
