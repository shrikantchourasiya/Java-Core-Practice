package basic_program;
import java.util.Scanner;

 class Solution{
    static int factorial(int n){
        if (n == 0){ // base cae
            return 1;
        }
        return n * factorial(n-1); // return type
    }
}
public class index10  {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n = sc.nextInt();
    
        int res = Solution.factorial(n);
        System.out.println(res);
    }
    
}
