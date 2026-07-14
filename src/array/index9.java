package array;
import java.util.Scanner;
public class index9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();

        int arr[][] = new int[rows][];
        System.out.println("Enter columns");
        int cols;
    for(int i =0; i <rows;i++){
        System.out.println("Enter the column for row" +i);
        cols = sc.nextInt();
        arr[i] = new int[cols];
         }  
     for(int i = 0; i <arr.length;i++){
        for(int j = 0; j <arr[i].length;j++){
             System.out.println("Enter rows and columns" +i +j);
             arr[i][j] = sc.nextInt();
        }
     }

      for(int i = 0; i <arr.length;i++){
        for(int j = 0; j <arr[i].length;j++){
             System.out.println(arr[i][j]);
        }
        System.out.println();
     }

    sc.close();
    }  
}
