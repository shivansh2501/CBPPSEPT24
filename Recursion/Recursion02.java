package Recursion;

public class Recursion02 {

    public static void main (String[] args) {

        //write a function that takes in a number and prints it
        //print first 5 numbers : 1 2 3 4 5
        printNum(1);    

        System.out.println(nthFibo(7));

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(linearSearch(arr, arr.length - 1, 8));

        System.out.println(binarySearch(arr, 0, arr.length - 1, 3));
    }

    static void printNum(int n) {

        if(n == 5) {
            System.out.println(5);;
            return;
        }

        System.out.print(n + " ");
        printNum(n + 1);
    }

    static int nthFibo(int n) {

        if(n == 1 || n == 2) {
            return n - 1;
        }

        int result = nthFibo(n - 1) + nthFibo(n - 2);

        return result;

    }

    static int linearSearch(int[] arr, int len, int target) {

        //Base Case
        if(len < 0) {
            return - 1;
        }

        //Code
        if(arr[len] == target) {
            return len;
        }

        int idx = linearSearch(arr, len - 1, target);

        return idx;
    }

    static int binarySearch(int[] arr, int start, int end, int target) {

        if(start > end) {
            return -1;
        }

        int mid = (start + end)/2;

        if(arr[mid] == target) {
            return mid;
        } else if(arr[mid] > target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }

        int el = binarySearch(arr, start, end, target);

        return el;

    }

    
}
