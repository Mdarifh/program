package firstProgram;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st =sc.next();
		int k = sc.nextInt();
		for(int i = 0; i<= st.length()-k;i++)
		{
			String t ="";
			for(int j = i; j < i+k;j++) {
				t = t+st.charAt(j);
				
			}
			System.out.println(t);
		}
	}

}
	