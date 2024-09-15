package Lecture02;

public class Datatypes2 {
    public static void main (String[] args) {
        boolean b= true;
        int a=-10;
        int miniInt=Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        short sh = -12;

        int minish = Short.MIN_VALUE;
        int maxsh = Short.MAX_VALUE;

        float f= 0.098765432f;
        double d= 11.01237848347329742974837;
        // System.out.println(f);
        // System.out.println(d);

        char c = 'a';//A = 65, a = 97
        byte b1 = Byte.MIN_VALUE;
        byte b2 = Byte.MAX_VALUE;

        System.out.println(b1 + " " + b2);
        // int a = c not possible
        System.out.println(c+2);

        // System.out.println(miniInt);
        // System.out.println(maxInt);
        // System.out.println(minish);
        // System.out.println(maxsh);
    }
}
