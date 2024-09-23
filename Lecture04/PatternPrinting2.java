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

    static void question12(int n) {

        for(int i = 1 ; i <= n ; i++) {

            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print(" ");
            }

            for(int k = 1 ; k <= i ; k++) {
                if(k%2 == 0) {
                    System.out.print("!");
                } else {
                    System.out.print("*");
                }
            }

            for(int l = 2 ; l <= i ; l++) {
                if((i % 2 == 0 && l % 2 == 0) || (i % 2 != 0 && l % 2 != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print("!");
                }
            }

            System.out.println();
        }
    }

    static void question16 (int n) {

        //Printing the upper tower
        for(int i = n ; i >= 1 ; i--) {
            for(int j = 1 ; j <= i - 1 ; j++) {
                System.out.print("  ");
            }

            for(int k = 1 ; k <= i ; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = 2 ; i <= n ; i++) {
            for(int j = 1 ; j <= i - 1 ; j++) {
                System.out.print("  ");
            }

            for(int k = 1 ; k <= i ; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void question17 (int n) {

        for(int i = n/2 ; i >= 1 ; i--) {

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }

            //Spaces
            for(int k = 1 ; k <= n/2 - i + 1 ; k++) {
                System.out.print("  ");
            }

            for(int m = 2 ; m <= n/2 - i + 1 ; m++) {
                System.out.print("  ");
            }

            //Second Tower
            for(int l = 1 ; l <= i ; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        for(int i = 1 ; i <= n/2 ; i++) {

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }

            //Spaces
            for(int k = 1 ; k <= n/2 - i + 1 ; k++) {
                System.out.print("  ");
            }

            for(int m = 2 ; m <= n/2 - i + 1 ; m++) {
                System.out.print("  ");
            }

            //Second Tower
            for(int l = 1 ; l <= i ; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void question18 (int n) {

        for(int i = 1 ; i <= n/2 + 1 ; i++) {

            for(int j = 1 ; j <= n/2 + 1 - i ; j++) {
                System.out.print("  ");
            }

            for(int k = 1 ; k <= i ; k++) {
                System.out.print("* ");
            }

            for(int l = 2 ; l <= i ; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = n/2 ; i >= 1; i--) {

            for(int j = 1 ; j <= n/2 + 1 - i ; j++) {
                System.out.print("  ");
            }

            for(int k = 1 ; k <= i ; k++) {
                System.out.print("* ");
            }

            for(int l = 2 ; l <= i ; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void question19 (int n) {

        for(int i = n/2 + 1 ; i >= 1 ; i--) {

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }

            for(int k = 2 ; k <= n/2 + 1 - i + 1 ; k++) {
                System.out.print("  ");
            }

            for(int l = 3 ; l <= n/2 + 1 - i + 1; l++) {
                System.out.print("  ");
            }

            for(int m = 1 ; m <= i && m <= n/2; m++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = 2 ; i <= n/2 + 1 ; i++) {

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }

            for(int k = 2 ; k <= n/2 + 1 - i + 1 ; k++) {
                System.out.print("  ");
            }

            for(int l = 3 ; l <= n/2 + 1 - i + 1; l++) {
                System.out.print("  ");
            }

            for(int m = 1 ; m <= i && m <= n/2; m++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void question20 (int n) {

        for(int i = n/2 + 1 ; i >= 1 ; i--) {

            for(int j = 2 ; j <= i ; j++) {
                System.out.print("  ");
            }

            System.out.print("* ");

            for(int k = 1 ; k <= (n/2 + 1) - i; k++) {
                System.out.print("  ");
            }

            for(int k = 2 ; k <= (n/2 + 1) - i; k++) {
                System.out.print("  ");
            }

            if(i<=(n/2)) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 2 ; i <= n/2 + 1 ; i++) {

            for(int j = 2 ; j <= i ; j++) {
                System.out.print("  ");
            }

            System.out.print("* ");

            for(int k = 2 ; k <= (n/2 + 1) - i + 1; k++) {
                System.out.print("  ");
            }

            for(int k = 3 ; k <= (n/2 + 1) - i + 1; k++) {
                System.out.print("  ");
            }

            if(i<=(n/2)) {
                System.out.print("*");
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

        question20(n);

        sc.close();
    }
    
}
