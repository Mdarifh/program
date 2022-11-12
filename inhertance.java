package firstProgram;

class inhertance1{
	int a = 200;
	void fun1() {
		System.out.println("JAVA");
	}
	
}


	class inhertance2 extends inhertance1{
	float b = 78.87f;
	void fun2() {
		System.out.println("PYTHON");
	}


}
	class inhertance3 extends inhertance2{
		 char  c= 'A';
			void fun3() {
				System.out.println("SPRING");
			}
		}
	
	class inhertance4 extends inhertance3{
		String s = "HUSSAIN";
		void fun4() {
			System.out.println("HIBERNET");
		}
		void display() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(s);
		}
	}


public class inhertance {
	public static void main(String[] args) {
		inhertance4 i4 = new inhertance4();
		i4.display();
		i4.fun1();
		i4.fun2();
		i4.fun3();
		i4.fun4();
	}

}
