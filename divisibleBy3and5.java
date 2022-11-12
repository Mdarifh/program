package firstProgram;

import java.util.Scanner;

public class divisibleBy3and5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i<arr.length;i++) 
		{
			if(arr[i]%3==0 || arr[i]%5==0) 
			{
				sum = sum + arr[i];
			}

		}
		 System.out.println(sum);



	}

}




























