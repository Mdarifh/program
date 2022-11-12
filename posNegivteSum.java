package firstProgram;

import java.util.Scanner;

public class posNegivteSum {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int [] arr = new int[n];
	
	for(int i =0; i<arr.length;i++) {
		arr[i] = scan.nextInt();	
	}
	
	int Psum = 0;
	int Nsum = 0;
	for(int i= 0; i<arr.length; i++) {
		if(arr[i]>=0) {
			Psum = Psum + arr[i];

		}
		else {
			Nsum = Nsum + arr[i];
		}
	}
	System.out.println(Psum+Nsum);
	System.out.println(Psum);
	System.out.println(Nsum);

	}
}