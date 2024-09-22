package Lecture04;
import java.util.*;

public class PatternPrintingQues {

    static void question6(int n) {

        for(int i = n ; i >=1  ; i--) {
            //k spaces
            for(int j = 1 ; j <= 2*(n-i) ; j++) {
                System.out.print(" ");
            }

            //Print Stars
            for(int k = 1 ; k <= i ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void question7(int n) {

        for(int i = 1 ; i <= n ; i++) {

            for(int j = 1 ; j <= n ; j++) {
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void question8(int n) {

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {
                if(i==j || j==n-i+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void question9(int n) {

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print(" ");
            } 

            for(int k = 1 ; k <= i ; k++) {
                System.out.print("*");
            }

            for(int l=2 ; l <= i ; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void question15(int n) {

        for(int i = n ; i >= 1 ; i--) {

            for(int j = 1 ; j <= 2*(n-i) ; j++) {
                System.out.print("  ");
            }

            for(int k = 1 ; k <= i ; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = 2 ; i <= n ; i++) {

            for(int j = 1 ; j <= 2*(n-i) ; j++) {
                System.out.print("  ");
            }

            for(int k = 1 ; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        question15(n);
    }
    
}
