package firstProgram;

import java.util.Scanner;

class de1{
	void fun1() {
		System.out.println("Connection4 is established");
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter the Numerator");
		int a = sc.nextInt();
		System.out.println("Enter the denominator");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println(c);
		}
		catch(Exception e) 
		{
			System.out.println("Some problem Occured");
		}
		
		System.out.println("Connection4 is Terminated");
	}
}
class de2{
	void fun2() {
		System.out.println("Connection3 is established");
		de1 d1 = new de1();
		d1.fun1();
		System.out.println("Connection3 is Terminated");
	}
}
class de3{
	void fun3() {
		System.out.println("Connection2 is established");
		de2 d2 = new de2();
		d2.fun2();
		System.out.println("Connection2 is Terminated");
	}
}


public class Exception {

	public static void main(String[] args) {
		System.out.println("Connection1 is established");
		de3 d3 = new de3();
		d3.fun3();
		System.out.println("Connection1 is Terminated");

	}

}
