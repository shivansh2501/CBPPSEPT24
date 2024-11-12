package PracticeArray;
import java.util.*;

public class practiceArr {
    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		Random rand = new Random();

		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = rand.nextInt(9);
		}

		printArray(arr);

		int[] result = plusOne(arr);

		printArray(result);

    }

	static void printArray(int[] arr) {

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

	}

		public static int[] plusOne(int[] digits) {
	
			ArrayList<Integer> result = new ArrayList<>();
	
			int i = digits.length - 1;
			int carry = 0;
	
			while(i >= 0 || carry > 0) {
				int currDig = carry;
	
				if(i >= 0) {
					currDig += digits[i];
				}
	
				carry = currDig / 10;
				currDig = currDig % 10;
				result.add(currDig);
			}
	
			Collections.reverse(result);
	
			int[] arr = new int[result.size()];
	
			for(int j= 0 ; j < arr.length ; j++) {
				arr[j] = result.get(j);
			}
	
			return arr;
	
		}
}
