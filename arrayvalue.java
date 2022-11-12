package firstProgram;

import java.util.Scanner;

public class arrayvalue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
				
		}
		for(int i = 0; i< arr.length;i++) {
			if(i%2==1) {
				System.out.print(i +" ");

				
			}

		}

	}

}
