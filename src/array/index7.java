// int [][] arr = new int [2][3];
// int arr[][] = new int [][];
// int []arr[] = new int[3][5];
// int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
package array;
import java.util.Scanner;
class index7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array : ");
         int size = sc.nextInt();
        
        int a[] = new int[size ];
        System.out.println("Plzz enter the elements in array : ");
        for(int i = 0; i <size;i++){
         a[i] = sc.nextInt();
 
          }
          System.out.println("Enter the element to delete (0 to " +(size - 1) + ") : ");
          int pos = sc.nextInt();
        
          for(int i = pos; i<size; i++){
            a[i] = a[i+1];

          }
        
                        size--;
        
            System.out.print("New Array");

            for(int i = 0 ; i < size ; i++){
                  System.out.print(a[i] + " ");
        
         }
    }}
