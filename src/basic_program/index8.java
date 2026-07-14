package basic_program;

public class index8 {
    public static void main(String args[]){
        int rev = 0;
        int res;
        int num =123;
        while (num > 0) {
         res = num%10;
         rev = rev*10 + res;
         num = num/10;   
        }
        System.out.println("num :"+rev);

        }   
            }

