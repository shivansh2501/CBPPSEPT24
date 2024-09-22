package Lecture05;

public class Arrays {

    public static void main (String[] args) {

        // int[] arr = new int[5];
        // arr[1] = 10;
        // arr[3] = 30;
        // arr[4] = 40;
        // arr[0] = 70;
        // arr[2] = 45;
        int[] arr;
        arr = new int[5];
        int[] nums = {1,2,3};
        arr = nums;
        char[] s = new char[10];
        s[0] = 'a';
        s[1] = 'n';
        s[2] = ' ';
        s[3] = 'k';
        

        // Study this for loop in Java
        for(int i:arr) {
            System.out.print(i++);
        }
    }
    
}
