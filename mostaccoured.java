package firstProgram;

import java.util.Scanner;

public class mostaccoured {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstLargest= Integer.MIN_VALUE;
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
			} 
		int maxcount = 0;
		int count = 1;
		int value = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
				
				
		}
			else 
			{
				if(count>maxcount) 
				{
					maxcount = count;
					value = arr[i];
				}
				count = 1;
			}
		
		}
		System.out.println(maxcount);

	}

}
