package firstProgram;

import java.util.Scanner;

public class arrayProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		
		
		int product = 1;
		
		for(int i = 0; i<arr.length; i++) {
			product = product * arr[i];
			}
		
		int[] res = new int[arr.length];
		for(int  i = 0; i<res.length; i++) {
			res[i] = scan.nextInt();
			res[i] = product / arr[i];
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(res[i]+ " ");

		}
	}
	


}


