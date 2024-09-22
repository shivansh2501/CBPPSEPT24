package Lecture05;
import java.util.*;

public class Functions {


    static boolean ArmstrongNum(int n) {

        int num = n;

        int digits = 0;

        while(num!=0) {
            num = num / 10;
            digits++;
        }

        num = n;
        int sum = 0;

        while(num!=0) {
            int curr = num % 10;

            sum += (int)Math.pow(curr,digits);

            num = num / 10;
        }

        return (sum==n);


    }

    //Redo this problem to reverse a number
    static int reverse(int n) {

        int len = 0;
        int temp = n;

        while(temp!=0) {
            temp /= 10;
            len++;
        }

        int reverse = 0;

        while(n!=0) {
            reverse += (n % 10) * (int)Math.pow(10,len-1);
            len--;
            n = n / 10;
        }

        return reverse;
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(ArmstrongNum(n));
        System.out.println(reverse(n));

    }
    
}
