// int [][] arr = new int [2][3];
// int arr[][] = new int [][];
// int []arr[] = new int[3][5];
// int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
package array;
import java.util.Scanner;
class index6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array : ");
         int size = sc.nextInt();
        
        int a[] = new int[size + 1];
        int pos = 2;
        int value = 100;
        System.out.println("Plzz enter the elements in array : ");
        for(int i = 0; i <size;i++){
         a[i] = sc.nextInt();
 
          }
        
          for(int i = size; i>pos; i--){
            a[i] = a[i-1];

          }
                        a[pos] = value;
                        size++;
        
            System.out.print("New Array");

            for(int i = 0 ; i < size ; i++){
                  System.out.print(a[i]);
        
         }
    }}
