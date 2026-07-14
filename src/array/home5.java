package array;

public class home5 {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,6,8};
        System.out.println("Even Numbers in the array:");
        for(int i = 0; i < arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("even numbers : " +arr[i]);
            } 
        }
    }
    
}
