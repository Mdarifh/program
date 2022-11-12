package firstProgram;

import java.util.Scanner;

public class missingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
			}
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
	
		}
		sum2 = (n+1)*(n+2)/2;
		System.out.println(sum2 - sum1);
	}

}


