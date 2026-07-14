// WAP to check whether the name is available on list or not
package array;
import java.util.Scanner;
public class index4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of list");
        int size= sc.nextInt();
        String ar[] = new String [size];
        System.out.println("Enter The names in list");
        for(int i=0; i <ar.length;i++){
            ar[i] = sc.next();
         }
         System.out.println("enter the name to search :");
         String searchname = sc.next();
         boolean found = false;
         for(int i = 0; i <size; i++){
            if(ar[i].equals(searchname)){
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
