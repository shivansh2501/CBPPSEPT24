package Lecture12;
import java.util.*;

public class twoDArrays {

    public static void main(String[] args) {
        
        // int[][] arr = new int[5][6];
        // int[][][] arr1 = new int[2][4][2];
        // int[][][][] arr2 = new int[3][4][1][5];
        // System.out.println(arr2);

        //Completely Sorted 2D Array - Flatten your 2D Array, Sort the flattened array, fill the 2D MATRIX

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        populateArray(arr, m, n);

        print2DArray(arr);

        System.out.println();

        System.out.println(SumMatrix(arr, m, n));

        // rowWiseSort(arr);

        // print2DArray(arr, m, n);

        // System.out.println();

        // colWiseSort(arr);

        System.out.println();

        // sortAll(arr);

        // print2DArray(arr, m, n);

        // print2DArray(transpose(arr));

        buildArray(arr);

        sc.close();
    }

    static void buildArray(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        int[] oneDArray = new int[rows * cols];

        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[0].length ; j++) {
                oneDArray[cols*i + j] = arr[i][j];
            }
        }

        for(int i = 0 ; i < oneDArray.length ; i++) {
            System.out.print(oneDArray[i] + " ");
        }

        System.out.println();


    }

    static void fillArray(int[] arr, int[][] arr1) {

        for(int i = 0 ; i < arr1.length ; i++) {
            for(int j = 0 ; j < arr1[0].length ; j++) {
                arr1[i][j] = arr[arr1[0].length * i + j];
            }
        }

        //Print the 2D Array
        for(int i = 0 ; i < arr1.length ; i++) {
            for(int j = 0 ; j < arr1[0].length ; j++) {
                System.out.print(arr1[i][j] + " ");
            }
        }

        System.out.println();

    }

    static void populateArray(int[][] arr, int m, int n) {

        // int naturalNum = 1;

        Random rand = new Random();

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }

    }

    static void rowWiseSort(int[][] arr) {

        for(int i = 0 ; i < arr.length ; i++) {
            Arrays.sort(arr[i]);
        }
    }

    static void colWiseSort(int[][] arr) {

        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

    }

    // static void sortAll(int[][] arr) {

    //     rowWiseSort(arr);
    //     colWiseSort(arr);

    // }

    static void print2DArray(int[][] arr) {

        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[0].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int SumMatrix(int[][] arr, int m, int n) {

        int sum = 0;

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                sum += arr[i][j];
            }
        }

        return sum;

    }

    static int[][] transpose(int[][] arr) {

        int trans[][] = new int[arr[0].length][arr.length];

        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[0].length ; j++) {
                trans[j][i] = arr[i][j];
            }
        }

        return trans;

    }
    
}

//Question 240s
