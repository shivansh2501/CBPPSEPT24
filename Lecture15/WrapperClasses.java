package Lecture15;

public class WrapperClasses {

    public static void main(String[] args) {
        
        int n1 = 10;
        Integer n2 = 10;
        Integer n3 = 100;
        Integer n4 = 100;
        Integer n5 = 128;
        Integer n6 = 128;
        int n7 = 128;
        int n8 = n6;
        Integer n9 = n7;

        //If we equate from 127 until -128, it will give true, else it will give false

        System.out.println(n6.equals(n7));
        System.out.println(n8);
        System.out.println(n7);

    }
    
}
