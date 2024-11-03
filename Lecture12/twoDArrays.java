package Lecture12;
import java.util.*;

public class twoDArrays {

    public static void main(String[] args) {
        
        // int[][] arr = new int[5][6];
        // int[][][] arr1 = new int[2][4][2];
        // int[][][][] arr2 = new int[3][4][1][5];
        // System.out.println(arr2);

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        populateArray(arr, m, n);

        print2DArray(arr, m, n);

        System.out.println();

        System.out.println(SumMatrix(arr, m, n));

        sc.close();
    }

    static void populateArray(int[][] arr, int m, int n) {

        int naturalNum = 1;

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = naturalNum++;
            }
        }

    }

    static void print2DArray(int[][] arr, int m, int n) {

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
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
    
}
