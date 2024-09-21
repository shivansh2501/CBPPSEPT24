package Lecture04;
import java.util.*;

public class PatternPrinting2 {

    //Creating a function
    static void printSquare(int n) {
        for(int i = 1 ; i <= n ; i++) {

            for(int j = 1 ; j <= n ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        return;
    }

    static void printRFT(int n) {
        //Printing Right Facing Triangle
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printLFT(int n) {
        
        for(int i = 1 ; i <= n ; i++) {
            //Printing Spaces
            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print("  ");
            }

            //Priniting Stars
            for(int k = 1 ; k <= i ; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void printIRFT(int n) {

        for(int i = n ; i >= 1 ; i--) {
            for(int j = i ; j >= 1  ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printILFT(int n) {
        
        for(int i = n ; i >= 1 ; i--) {
            //Printing Spaces
            for(int j = n - i ; j >= 1  ; j--) {
                System.out.print("  ");
            }

            //Printing Star
            for(int k = i ; k >= 1 ; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // printRFT(n);

        // System.out.println();

        // printSquare(n);

        printILFT(n);

        sc.close();
    }
    
}
