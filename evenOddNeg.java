package firstProgram;

import java.util.Scanner;

public class evenOddNeg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		
		for(int i = 0; i<arr.length;i++) {
			if( arr[i]<0) {
				System.out.print(arr[i] +" ");
			}
		}
		
		System.out.println();
		
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2!=0 && arr[i]>0) {
				System.out.print(arr[i] +" ");
			}
		}
		
		System.out.println();

		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2==0 && arr[i]>0) {
				System.out.print(arr[i] +" ");
			}
		}
		
		

	}

}
