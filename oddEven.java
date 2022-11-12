package firstProgram;

import java.util.Scanner;

public class oddEven {
	public static void main(String[] args) {
		
		/*System.out.print("Entered a number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a % 2==0) {
			System.out.print("Number is even");
		}
		else {
			System.out.print("number is odd");*/
		//}
		
		         //BITWISE OR
		
		
	/*	System.out.print("Entered a number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if((a | 1)> a) {
			System.out.print("Number is even");
		}
		else {
			System.out.print("number is odd");
		}*/
		
		           //Bitwise AND
		
		System.out.print("Entered a number is: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if((a & 1) == 1) {
			System.out.print("Number is odd");
		}
		else {
			System.out.print("number is even");
		}

	}
}
