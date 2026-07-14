package array;
import java.util.Scanner;
class index2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of Array : ");
         int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Plzz enter the Elements of an array");
        for(int i = 0; i <size;i++){
         a[i] = sc.nextInt();
          }
          for(int i = 0; i<size; i++){
            System.out.println("elements of array "+a[i]);
          }
        
        }
    }
