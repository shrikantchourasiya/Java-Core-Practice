package array;

import java.util.Scanner;
class index3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of students in class : ");
         int size = sc.nextInt();
         int  sum= 0;
        int a[] = new int[size];
        System.out.println("Plzz enter the percentage  of an student in a class");
        for(int i = 0; i <size;i++){
         a[i] = sc.nextInt();
          }
          for(int i = 0; i<size; i++){
            
            System.out.println("percent of student :  "+a[i]);
             
                       
            
          }
          int av = to/size;
          System.out.println("average of class : " +av);
        
         }
    }
