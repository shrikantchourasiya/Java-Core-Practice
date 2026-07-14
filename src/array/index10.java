package array;
import java.util.Scanner;
class index10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of Array : ");
         int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Plzz enter the Elements of an array");
        for(int i = 0; i <size;i++){
         a[i] = sc.nextInt();
          }
          System.out.println("enter the value");
          int value = sc.nextInt();
           boolean found = false;
         for(int i = 0; i <size; i++){
            if(a[i]==value){
                found = true;
            }
         }
         if(found) {
            System.out.println("name found");
         } 
         else {
            System.out.println("name not found");
         }
    
        
        }
    }
