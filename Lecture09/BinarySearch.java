package Lecture09;
// import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);

        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4};

        int target = 60;

        System.out.println(upperBound(arr, target));

    }

    public static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(target == arr[mid]) {
                return mid;
            } else if(target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    //lowerBound is the mathematical term for "First Occurence of an Element."
    public static int lowerBound(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        int ans = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;

    }


    // upperBound is a mathematical term used to describe the "Last Occurence of an Element + 1"
    public static int upperBound(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        int ans = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == target) {
                ans = mid + 1;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;

    }
    
}
