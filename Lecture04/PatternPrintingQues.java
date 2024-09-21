package Lecture04;
import java.util.*;

public class PatternPrintingQues {

    static void question6(int n) {

        for(int i = 1 ; i <= n ; i++) {
            //k spaces
            for(int j = 1 ; j <= (i-1)*2 ; j++) {
                System.out.print("  ");
            }

            //Print Stars
            for(int k = 1 ; k <= n - i + 1 ; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        question6(n);
    }
    
}
