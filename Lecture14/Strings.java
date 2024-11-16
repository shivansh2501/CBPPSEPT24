package Lecture14;

public class Strings {
    
    public static void main(String[] args) {

        // String s1 = "A";
        // String s2 = "C";
        // String s3 = new String("Pacman");
        // int[] arr = new int[10];
        // char[] s4 = new char[10];
        // s4[0] = 'h';
        // s4[1] = 'i';
        // System.out.println(s4);
        // System.out.println(arr);
        // System.out.println(s1==s2);
        // System.out.println(s2==s3);
        // System.out.println(s3==s1);
        // System.out.println(s1.compareTo(s2)); //compareTo
        // System.out.println(s3.substring(2,4)); //substring fn
        // System.out.println(s3.length());
        // System.out.println(s3.charAt(4));
        // // System.out.println("AB".compareTo("BA"));

        // String s5 = s1 + " " + s3 + 10 + 20 + 30;
        // String s6 = s1.concat(s3).concat(s2);
        // System.out.println(s6);
        // System.out.println(s5);

        // System.out.println(s6.toLowerCase());
        // System.out.println(s6.toUpperCase());

        String name = "Shivansh";

        System.out.println(reverse(name));


    }

    //Write a function to reverse a string
    static String reverse(String str) {

        String result = "";

        for(int i = str.length() - 1 ; i >= 0 ; i--) {

            result += str.charAt(i);

        }

        return result;

    }

}
