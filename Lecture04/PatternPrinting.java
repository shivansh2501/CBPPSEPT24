package Lecture04;
import java.util.*;

public class PatternPrinting {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //Printing Square
        for(int i = 1 ; i <= n ; i++) {

            for(int j = 1 ; j <= n ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
    
}