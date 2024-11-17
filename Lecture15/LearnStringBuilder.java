package Lecture15;

public class LearnStringBuilder {

    public static void main(String[] args) {
        
        // StringBuilder sb = new StringBuilder("Hi");
        // sb.ensureCapacity(100); //Ensure capcaity at the start!

        // sb.append("Cats");
        // sb.append("Cats");
        // sb.append("Cats");
        // sb.append("Cats");
        // sb.append("Cats");
        // sb.insert(2, "DOGS");
        // sb.replace(2, 6, "I love DSA"); //to replace any part of your string
        // sb.delete(0, 5);
        // sb.reverse();
        // System.out.println(sb.length()); // Prints the length of the string
        // System.out.println(sb.capacity()); //Default size of StringBuilder in character array is 16

        // System.out.println(sb);

        String str = "To be or not to be";

        System.out.println(reverseStr(str));

    }

    static String reverseStr(String str) {

        str = str.trim();

        String[] arr = str.split("\\s+");

        String result = "";

        for(int i = arr.length - 1 ; i >= 0 ; i--) {

            result += arr[i] + " ";

        }

        return result.trim();

    }


    
}
