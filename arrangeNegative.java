package firstProgram;

import java.util.Scanner;

public class arrangeNegative {
	
	

	static int[] arrangeNegativeArr(int[] arr){
		int count = 0;
		int i;
		for (i = arr.length-1;i-count>=0; i--) {
			if(arr[i-count]==-1) {
				count++;
				}
			arr[i]=arr[i-count];
		}
		
		while(i>=0) {
			arr[i]=-1;
			i--;
		}
		return arr;
		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(arrangeNegativeArr(arr));
	}
			
	}