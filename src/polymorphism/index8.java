// overloading categorised in 3 types
// 1. Method overloading 2. constructor overloading 3. operator overloading

// Method overloading
//name branch
//  name branch    id
   // name branch  id  college namecollege 
package polymorphism;

import java.util.Scanner;
public class index8 {

     void student(String name, String branch){
         System.out.println("Student_Name" +name );
        System.out.println("Student branch : "+branch );
        
}

void student(String name, String branch, int id){
        System.out.println("Student branch : "+name );
        System.out.println("Student branch : "+branch );
        System.out.println("Student id "+id);
        
     
}

void student(String name, String branch, int id, String Collegename){
     System.out.println("Student branch : "+name );
        System.out.println("Student branch : "+branch );
        System.out.println("Student id "+id);
        System.out.println("Student college name "+Collegename);
       
}



    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        index8 i = new index8();
        System.out.println("Enter the number of arguments (2,3 or 4) : ");
        int arg = sc.nextInt();
        switch(arg){
        case 2: System.out.println("Student Detail = name and branch");
        System.out.println("Please Enter the Student Name");
        String name = sc.next();
        System.out.println("Please Enter the Branch");
        String branch= sc.next();
        i.student(name,branch);
        break;

        case 3: System.out.println("Employee Detail = name, Branch and id");
        System.out.println("Please Enter the Student Name");
         name = sc.next();
        System.out.println("Please Enter the Branch");
         branch = sc.next();
         System.out.println("Please Enter the id");
        int id = sc.nextInt();
        i.student(name,branch,id);
        break;

         case 4: System.out.println("Student Detail = name, Branch, id and CollegeName");
        System.out.println("Please Enter the Student Name");
         name = sc.next();
        System.out.println("Please Enter the Branch");
         branch = sc.next();
         System.out.println("Please Enter the id");
         id = sc.nextInt();
        System.out.println("Please Enter the CollegeName");
        String Collegename= sc.next();    
    i.student(name, branch,id,Collegename);
    break;

default:
    System.out.println("Invalid Argument");
}
   

}}


    
   
    
        



