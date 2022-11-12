package firstProgram;

import java.util.Scanner;

public class averageSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float [] arr = new float[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextFloat();
		}
		
		float sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		float average = sum /n;
		System.out.println(average);
		
	}

}
