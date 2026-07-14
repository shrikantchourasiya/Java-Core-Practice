package basic_program;
import java.util.Scanner;

public class index4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        double num1 = sc.nextDouble();
         System.out.println("Enter second num");
         double num2 = sc.nextDouble();

         System.out.println("Enter Operator  (+, -, *, / ): ");
         char  op = sc.next().charAt(0);
         double result;

         switch(op) {
            case '+' :
                result = num1 + num2;
                System.out.println("Result :" +result);
                break;
                case '-' :
                    result = num1 - num2;
                System.out.println("Result :" +result);
                break;
                case '*' :
                    result = num1 * num2;
                System.out.println("Result :" +result);
                break;
            
                case '/' :
                    if(num2 != 0) {
                        result = num1/ num2;
                        System.out.println("Result = " +result);
                    }
                    else {
                        System.out.println("Cannot divide by 0");
                    }
                break;

                default:
                    System.out.println("invalid operator");
         
         
         }
         sc.close();
    }
    
}
