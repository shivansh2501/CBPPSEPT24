package Recursion;
import java.util.*;

public class Recursion01 {
    
    public static void main(String[] args) {

        //write a function that prints hello world
        message(5);

    }

    static void message(int n) {

        if(n == 0) {
            return;
        }

        message(n-1);
        System.out.println("Hello World");
    }

}
