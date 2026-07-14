package array;
import java.util.Scanner;
public class home1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] =new int [6];
         System.out.println("Enter 6 integers : ");
        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
             }

             System.out.println("Array in reverse order:");
             for(int i = arr.length - 1; i>=0;i--){
                System.out.print(arr[i] + " ");
             }
             sc.close();
    }
    
}
