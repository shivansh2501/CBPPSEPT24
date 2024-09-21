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
            for(int j = 2 ; j <= i ; j++) {
                System.out.print(j + " ");
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

    static void question13(int n) {
        
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = n - 1 ; i >= 1 ; i--) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void question14 (int n) {

        //Printing upper triangle
        for(int i = 1 ; i <= n ; i++) {

            for(int k = 1 ; k <= n - i ; k++) {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = n - 1 ; i >= 1 ; i--) {

            //Prining Spaces
            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print(" ");
            }

            //Printing Stars
            for(int k = 1 ; k <= i ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void question10(int n) {

        for(int i = n ; i >= 1 ; i--) {

            for(int l = 1 ; l <= n - i ; l++) {
                System.out.print("  ");
            }

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }

            for(int k = 2 ; k <= i ; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void question11 (int n) {

        for(int i = 1 ; i <= n ; i++) {

            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print("  ");
            }

            for(int k = 1 ; k <= i ; k++) {
                if(k % 2 == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            for(int l = 1 ; l <= i ; l++) {
                if((l % 2 ==0 && i % 2 == 0) || (l % 2 != 0 && i % 2 != 0)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
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

        question11(n);

        sc.close();
    }
    
}
