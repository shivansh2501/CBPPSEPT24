package Lecture08;
import java.util.*;

public class NGER {

    public static int[] NGR(int[] arr) {
        int maxEl = 0;
        int[] nger = new int[arr.length];

        //Fill
        for(int i = arr.length - 1 ; i >= 0 ; i--) {
            nger[i] = maxEl;

            maxEl = Math.max(maxEl, arr[i]);
        }

        return nger;
    }

    public static int[] NGL(int[] arr) {
        int maxEl = 0;
        int[] ngel = new int[arr.length];

        //Fill
        for(int i = 0 ; i < arr.length ; i++) {
            ngel[i] = maxEl;

            maxEl = Math.max(maxEl, arr[i]);
        }

        return ngel;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] finalResult = NGL(arr);

        printArray(finalResult);

        sc.close();
    }

    static void printArray(int[] arr) {

        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    
}
