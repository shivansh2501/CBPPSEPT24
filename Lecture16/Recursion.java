package Lecture16;
import java.util.*;

public class Recursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // int n = sc.nextInt();

        System.out.println(rev("hello"));

    }

    static int fibo(int n) {

        if(n == 0 || n == 1) {
            return n;
        }

        int fibo1 = fibo(n-1);
        int fibo2 = fibo(n-2);

        return fibo1 + fibo2;

    }

    static int factorial(int n) {

        if(n == 0) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    static int power(int x, int n) {

        if(n == 0) return 1;

        return x * power(x, n-1);
    } 

    static int factTail(int n, int k) {

        if(n == 1) {
            return k;
        }

        return factTail(n-1, n*k);

    }

    static int powTail(int x, int n, int k) {

        if(n == 0) {
            return k;
        }

        return powTail(x, n-1, x*k);

    }

    static String rev(String s) {

        if(s.length() == 0) {
            return "";
        }

        return rev(s.substring(1, s.length())) + s.charAt(0);
    }

}