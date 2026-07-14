// int [][] arr = new int [2][3];
// int arr[][] = new int [][];
// int []arr[] = new int[3][5];
// int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
package array;
import java.util.Scanner;
public class index5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the rows");
        int rows= sc.nextInt();
        System.out.println("Please enter the column");
        int column = sc.nextInt();
        int arr[][] = new int[rows][column];
        System.out.println("please enter the Elements of the array");
        for(int i = 0; i <arr.length;i++){
             for(int j = 0; j<arr.length;j++){
              arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("array");
         for(int i = 0; i <arr.length;i++){
             for(int j = 0; j<arr.length;j++){
              System.out.print(arr[i][j]);
            }
            System.out.println();
        }
       
   sc.close();
    }
    
}
