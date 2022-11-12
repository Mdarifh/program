package firstProgram;

import java.util.Scanner;

public class MergeTwo {
	static int[] mergeSortedArray(int[] ar, int[] arr,int ar1[]) {
		int i=0,j=0,k=0,l=0;
		int[] res =new int[ar.length + arr.length + ar1.length];
		while(i<ar.length && j< arr.length && l< ar1.length) {
			if(ar[i]<arr[j]) {
				res[k] = ar[i];
				i++;
				k++;
				
			}
			else if(arr[j]<ar1[l]) {
				res[k]=arr[j];
				k++;
				j++;
			}
			else {
				res[k]=ar1[l];
				k++;
				l++;
			}
		}
		while(i<ar.length) {
			res[k] = ar[i];
			i++;
			k++;
			
		}
		while(j<arr.length) {
			res[k] = arr[j];
			j++;
			k++;
			
		}
		if(l<ar1.length) {
			res[k]=arr[l];
			k++;
			l++;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ar = {3,5,9,12,15};
		int[] arr = {1,6,8,11};
		int[] ar1 = {0,4,7};
	
		
		int[] res = mergeSortedArray(ar,arr,ar1);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
			
		}
	
	}

}
