package PracticeArray;

import java.util.*;
public class practiceArr {
    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 1 ; i <= (n/2) + 1 ; i++) {

			for(int j = 2*(n-i) ; j >= 1 ; j--) {
				System.out.print(" " + " ");
			}

			int printVal = i;

			for(int k = 1 ; k <= i ; k++) {
				System.out.print(printVal-- + " ");
			}

			for(int l = 2 ; l <= i ; l++) {
				System.out.print(" " + " ");
			}

			for(int m = 3 ; m <= i ; m++) {
				System.out.print(" " + " ");
			}

			printVal+= 1;

			for(int o = 1 ; o <= i && i>=2; o++) {
				System.out.print(printVal++ + " ");
			}

			System.out.println();

		}

		for(int i = (n/2) ; i >= 1 ; i--) {

			for(int j = 2*(n-i) ; j >= 1 ; j--) {
				System.out.print(" " + " ");
			}

			int printVal = i;

			for(int k = 1 ; k <= i ; k++) {
				System.out.print(printVal-- + " ");
			}

			for(int l = 2 ; l <= i ; l++) {
				System.out.print(" " + " ");
			}

			for(int m = 3 ; m <= i ; m++) {
				System.out.print(" " + " ");
			}

			printVal+= 1;

			for(int o = 1 ; o <= i && i>=2; o++) {
				System.out.print(printVal++ + " ");
			}

			System.out.println();

		}

    }
}
