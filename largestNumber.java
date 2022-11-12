package firstProgram;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstLargest= Integer.MIN_VALUE;
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
			}
		for (int i = 0; i < arr.length; i++) {
			if(firstLargest<arr[i]) {
				firstLargest = arr[i];
				
			}
		}
		System.out.println(firstLargest);
	}

}
