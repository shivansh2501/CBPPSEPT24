package Lecture04;
import java.util.*;
import java.lang.Math;

public class praticeAST {

    public static void main(String[] args) {
        
        // Your Code Here

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int newNum = 0;

        while(num!=0) {
            int exp = 0;
            int old_dig = num % 10;
            int new_dig = 9 - old_dig;

            if(new_dig < old_dig) {
                newNum += new_dig*((int)Math.pow(10,exp));
            } else {
                newNum += old_dig*((int)Math.pow(10, exp));
            }

            exp++;
            num = num / 10;
        }

        System.out.println(newNum);

        sc.close();

    }
    
}
