package firstProgram;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		int max;
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max= a[i];
				
			}
		}
		System.out.println("The Largest Element in the Array:" +max);
		
		// TODO Auto-generated method stub

	}

}
