package firstProgram;

import java.util.Scanner;

public class Palindrome {
 static	boolean IsPalindrome(String s) {
		int i = 0 ;
		int j = s.length()-1;
		while(i<j){
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);
	//	String s = scan.nextLine();
		 
		/*  if(IsPalindrome(s)) {
			  System.out.println("IS PALINDROME");
		  }
		  else {
			  System.out.println("NOT PALINDROME");*/
		
		
		System.out.println(IsPalindrome( new Scanner(System.in).nextLine()) ?    "IS PALINDROME"  :  "NOT PALINDROME" );
		  
		

	}

}
