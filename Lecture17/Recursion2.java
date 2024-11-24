package Lecture17;

public class Recursion2 {

    public static void main(String[] args) {
        
        // System.out.println(countSubseq2("car", "", 1));

        generatePerm("abc", "");
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

    //WAP a program to count the subsequeces in a string! (Tail Recursion)
    static int countSubseq2(String ques, String ans, int count) {

        if(ques.length() == 0) {
            return count;
        }

        char a = ques.charAt(0);

        //Include character
        int inc = countSubseq2(ques.substring(1), ans + a, count);
        //Don't include the character
        int notInc = countSubseq2(ques.substring(1), ans, count);

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

    //Generating Paranthesis
    static void generateParanthesis(int n, int l, int r, String ans) {

        if(r==l && n == l) {
            System.out.println(ans);
            return;
        }

        if(l > n || r > l) {
            return;
        }


        generateParanthesis(n, l + 1, r, ans + "{");

        generateParanthesis(n, l, r + 1, ans + "}");


    } 

    //Generate Permutations
    static void generatePerm(String s, String ans) {

        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < s.length() ; i++) {

            generatePerm(s.substring(0, i) + s.substring(i+1), ans + s.charAt(i));

        }

    }

}

// Tower of Hanoi
