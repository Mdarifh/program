package firstProgram;

import java.util.Scanner;

public class maxarray {

	

	public static void main(String[] args) {
		System.out.print("Enter the Element:");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		int max = arr[0];
		
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();			

			if(arr[i]>max) {
				max = arr[i];
				}
		}
		System.out.println("The Maximum number is: "+max);

	}
 }	
	


