package array;

public class home4 {
    public static void main(String[] args) {
        int arr[] = {33,44,55,66,99};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
           if(arr[i]> max){
            max = arr[i];
           }
        
           if(arr[i] < min){
            min = arr[i];
           }}
           System.out.println("Maximum value = " +max);
           System.out.println("Minimum value = " +min);
    }
    
}
