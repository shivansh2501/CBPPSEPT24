package Lecture07;
import java.util.*;

public class bubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 5, 4, 3};

        print(arr);

        insertionSort(arr);

        print(arr);

    }

    static void print(int [] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insertionSort(int[] arr) {

        for(int i = 1 ; i < arr.length ; i++) {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
    
    static void bubSort(int[] arr) {

        for(int i = 1 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length - i ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
