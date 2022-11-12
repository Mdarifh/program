package firstProgram;

import java.util.Iterator;
import java.util.Scanner;

public class loesgestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i]= scan.nextInt();
		}
		int si = 0, ei = 0, start = 0, end = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]-arr[i+1]==-1) {
				ei++;
			}
			else {
				if(ei-si > end-start) {
					start = si;
					end = ei;
				}
				si =  i+1;
				ei = i+i;
			}
			
		}
		if(ei-si > end-start) 
		{
			start = si;
			end = ei;
		}
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
