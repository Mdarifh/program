package firstProgram;

import java.util.Scanner;
public class CamelCase {

static int CamelCase(String s) {
	int count = 1;
	for(int i = 0; i<s.length(); i++) {
		if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
			count++;
		}
	}
	return count;
}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(CamelCase(s));

	}

}
