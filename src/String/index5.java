// StringBuider non-synchronized

package String;
import java.util.Scanner;

public class index5{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Scanner: ");
        String s = sc.next();
        char ch = ' ';
        String str = "";
        
        for(int i = s.length()- 1; i>=0;i--){
            ch = s.charAt(i);
        str = str + ch;

    
        }
         System.out.println(str);

if(s.equals(str)){
    System.out.println("true");
} else
    System.out.println("false");
    System.out.println(s.equals(str));

              
}
    
}
