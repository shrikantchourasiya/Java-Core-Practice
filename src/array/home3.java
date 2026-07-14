package array;

public class home3 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
       int sum = 0;
        for(int i=0; i <arr.length;i++){
           sum += arr[i];
        }
        System.out.println("Sum of all values = " + sum);
    }
    
}
