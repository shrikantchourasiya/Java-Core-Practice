package array;
import java.util.Scanner;
public class home2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        System.out.println("Enter 5 names : ");
        for(int i = 0; i <arr.length;i++){
            arr[i]= sc.next();
        }
        System.out.println("Enter the name to Search :");
        String searchname = sc.next();
        boolean found = false;
        for(int i =0; i<arr.length;i++){
        if(arr[i].equals(searchname)){
            found = true;
        }
         } 
        if(found){
            System.out.println("name found");
        } else {
            System.out.println("not found");
        }
         }
    
}
