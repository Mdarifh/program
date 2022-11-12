package firstProgram;

import java.util.Scanner;

public class largestOfThree {
	
	
	static int largestOfThree(int x, int y, int z) {
		
		return z> (x>y ? x:y) ?z : ((x>y)? x:y);
	} 

	public static void main(String[] args) {
		int largest;
		System.out.println("Enter  a number");
	
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c =scan.nextInt();

		largest = largestOfThree(a,b,c);
		System.out.println("The Largest Number is:" +largest);
		
		// TODO Auto-generated method stub
		
	
			
		}

	}


