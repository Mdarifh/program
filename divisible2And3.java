package firstProgram;

import java.util.Scanner;

public class divisible2And3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
	
		for(int i = 0; i<arr.length;i++) 
		{
			if(arr[i]%2==0 || arr[i]%3==0) 
			{
				 System.out.print(arr[i] +" ");

			}

		}

	}

}
