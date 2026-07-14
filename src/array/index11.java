package array;

import java.util.Scanner;

public class index11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of Array : ");
         int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Plzz enter the sorted array elements :");
        for(int i = 0; i <size;i++){
         a[i] = sc.nextInt();
          }
          System.out.println("enter element to search: ");
          int target = sc.nextInt();
          int left =0;
          int right = size -1;
          int index = -1;
          // binary search
          while(left<=right) {
            int mid = (left + right)/2;
            if(a[mid] == target) {
              index = mid;
              break;   
            }
            else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
          }

          if(index!= -1) {
            System.out.println("Element found at index: " +index);
          } else {
            System.out.println("Element not found.");
          }
    
        sc.close();
        }
   
}
