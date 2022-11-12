package firstProgram;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] > max) {
			max = arr[i];
			}
			
			
		}
		System.out.println(sum-max);
		System.out.println(sum-min);
	}

}
