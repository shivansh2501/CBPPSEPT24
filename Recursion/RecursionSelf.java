package Recursion;
import java.util.Random;

import java.util.Scanner;

public class RecursionSelf {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int i = sc.nextInt();

        Random rand = new Random();

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = rand.nextInt(10);
        }

        printArray(arr, arr.length - 1);

        System.out.println();

        System.out.println("Max el is at: "+ maxArray(arr, arr.length - 1));

        // printName(n);

    }

    static int max = Integer.MIN_VALUE;

    public static int maxArray(int[] arr, int n) {

        if(n < 0) {
            return max;
        }

        int max = maxArray(arr, n - 1);

        if(arr[n] > max) {
            max = n;
        }

        return max;

    }

    public static void displayReverse(int[] arr, int length) {

        if(length < 0) {
            return;
        }

        System.out.println(arr[length]);
        displayReverse(arr, length - 1);

    }

    public static void printName(int n) {

        if(n==0) {
            return;
        }

        printName(n - 1);
        System.out.println("Shivansh");

    }

    public static void printDecreasing(int n) {

        if(n == 0) {
            return;
        }

        System.out.println(n);

        printDecreasing(n - 1);

    }

    public static void printIncreasing(int n) {

        if(n == 0) {
            return;
        }

        printIncreasing(n -1);

        System.out.println(n);

    }

    public static int factorial(int n) {

        if(n == 0) {
            return 1;
        }

        return n * factorial(n-1);

    }

    public static int calcPower(int n, int i) {

        if(i == 0) {
            return 1;
        }

        return n * calcPower(n, i - 1);
    }

    public static void pdi(int n) {

        if(n == 0) {
            return;
        }

        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

    public static void printArray(int[] arr, int n) {

        if(n < 0) {
            return;
        }

        printArray(arr, n - 1);
        System.out.print(arr[n] + " ");

    }
}
