package firstProgram;

import java.util.Scanner;

public class mergeTwoArray 
{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0; i<arr1.length;i++) 
		{
			arr1[i]= scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i] =scan.nextInt();
		}
		int[] res  = mergeArray(arr1,arr2);
		
			for (int i = 0; i < res.length; i++)
			{
				System.out.print(res[i]+" ");
			}
		
	}
	

		static int[] mergeArray(int[] arr1, int[] arr2) { 
			 
		int[] res = new int[arr1.length+arr2.length];
		int i = 0, j=0, k=0;
		
		while(i<arr1.length && j<arr2.length) {
		
			
			if(arr1[i]<arr2[j]) 
			{
				res[k]=arr1[i];
				k++;
				i++;
			}
			else 
			{
				res[k]=arr2[j];
				k++;
				j++;
			}
		
		}	
			while(i<arr1.length) 
			{
				res[k]=arr1[i];
				k++;
				i++;
			}
			while(j<arr2.length) 
			{
				res[k]=arr2[j];
				k++;
				j++;
			}
			return res;
			
		 }	
			
	 
  }
