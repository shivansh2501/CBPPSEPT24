package Lecture06;
import java.util.*;

public class PracticeArray {

    static void display(int[] arr) {

        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static void reverse(int [] arr) {

        for(int i = arr.length - 1 ; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    static void reverseProp(int[] arr) {

        // Create a new array
        int newArr[] = new int[arr.length];

        // Add elements from old array in new array in reverse order
        for(int i = 0, j = arr.length - 1 ; i <newArr.length ; i++, j--) {
            newArr[i] = arr[j];
        }

        // Copy the new reversed array to the old array
        // arr = newArr; //Shallow Copy
        for(int i = 0 ; i < arr.length ; i++) { // Deep Copy
            arr[i] = newArr[i];
        }

    }

    static void reverse2 (int[] arr) {

        for(int i = 0, j = arr.length - 1 ; i < j ; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

    public static void main(String[] args) {
        
        // int[] arr = {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // for(int i = 0 ; i < arr.length ; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println("Enter the index of elements to be swapped");

        // int i = sc.nextInt();
        // int j = sc.nextInt();

        // swap(arr, i, j);

        int[] arr = {1,2,3,4,5};

        reverse2(arr);

        display(arr);

        // display(arr);

        //for-each loop
        // for(int i : arr) {
        //     System.out.print(i + " ");
        // }

        sc.close();
    }
    
}
