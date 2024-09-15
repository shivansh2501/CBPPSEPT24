package Lecture03;
import java.util.Scanner;

public class LoopsQuestions {
    public static void main(String[] args) {
        

        //WAP to find whether a number is Prime or Not

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        for(int i = 2 ; i < n ; i++) {
            if(n%i==0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
