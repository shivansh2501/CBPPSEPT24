package Lecture09;
// import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);

        int[] arr = {6, 7, 8, 9, 10, 11, 12, 13};

        int target = 71;

        System.out.println(binarySearch(arr, target));

    }

    public static boolean binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(target == arr[mid]) {
                return true;
            } else if(target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
    
}
