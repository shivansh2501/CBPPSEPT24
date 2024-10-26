package Lecture07;
import java.util.*;

public class sortingTechniques {

    public static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =  0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        printArray(arr);

        sc.close();
    }

    public static void selectionSort(int[] arr) {

        for(int i = 0 ; i < arr.length - 1 ; i++) {

            int maxi = i;
            //int minIdx = findMin(arr, mini);

            //Finding minimum here itself
            for(int j = i ; j < arr.length ; j++) {
                if(arr[maxi] < arr[j]) {
                    maxi = j;
                }
            }

            //Swapping
            int temp = arr[i];
            arr[i] = arr[maxi];
            arr[maxi] = temp;

        }
    }

    public static void insertionSort(int[] arr) {

        for(int i = 1 ; i < arr.length ; i++) {

            for(int j = i ; j > 0 && arr[j-1] > arr[j] ; j--) {

                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
    }

    public static void bubbleSort(int[] arr) {

        for(int i = arr.length - 1 ; i >= 1; i--) {

            boolean didSwap = false;

            for(int j = 0 ; j <= i - 1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }

            if(!didSwap) {
                break;
            }
        }
    }

    public static int findMin(int[] arr, int mini) {

        for(int i = mini ; i < arr.length ; i++) {
            if(arr[i] < arr[mini]) {
                mini = i;
            }
        }

        return mini;
    }
}