package firstProgram;

import java.util.Scanner;

public class CountNumberOfWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int count = 0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count+1);

	}

}
