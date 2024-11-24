package Lecture17;

public class Recursion2 {

    public static void main(String[] args) {
        
        System.out.println(countSubseq("car", ""));
    }
    
    //WAP to generate all the subsequences

    static void printSubseq(String ques, String ans) {

        if(ques.length() == 0) {
            System.out.println(ans);
            return; 
        }

        char a = ques.charAt(0);

        //Include character
        printSubseq(ques.substring(1), ans + a);
        //Don't include the character
        printSubseq(ques.substring(1), ans);

    }

    //WAP a program to count the subsequeces in a string! (Head Recursion)
    static int countSubseq(String ques, String ans) {

        if(ques.length() == 0) {
            return 1;
        }

        char a = ques.charAt(0);

        //Include character
        int inc = countSubseq(ques.substring(1), ans + a);
        //Don't include the character
        int notInc = countSubseq(ques.substring(1), ans);

        return inc + notInc;
    }

    //Coin toss
    static void CoinToss(int n, String s) {

        if(n == 0) {
            System.out.println(s);
            return;
        }

        CoinToss(n - 1, s + "H");
        CoinToss(n - 1, s + "T");

    }

}
