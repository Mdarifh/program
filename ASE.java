package firstProgram;

import java.util.Scanner;

public class ASE {
	public static boolean isAseNumber(int n) {
	int count = 0;
		for(int i  = 1; i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==4) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
		int aes = 0;
		for (int i = 1; i <=r ; i++) {
			if(isAseNumber(i)==true)
				aes++;
			
		}
		System.out.println(aes);
				
	}


}
