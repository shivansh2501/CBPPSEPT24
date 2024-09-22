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

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(ArmstrongNum(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

    }
    
}
