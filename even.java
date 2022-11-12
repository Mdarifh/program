package firstProgram;

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number of value:");
		 int size = scan.nextInt();
		 int [] arr = new int[size];		 
		 
		System.out.println("enter value:");
		 for(int i = 0; i<arr.length-1; i++) {
			 if(i%2==0) {
					System.out.println(" "+i);
			 }
		 }
		
	}

}
