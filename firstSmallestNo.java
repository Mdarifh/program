package firstProgram;

import java.util.Scanner;

public class firstSmallestNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
			}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<firstSmallest) {
				firstSmallest = secondSmallest;
				firstSmallest = arr[i];
				
			}
			else if(arr[i]<secondSmallest && arr[i]!=firstSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println(secondSmallest);

	}

}
