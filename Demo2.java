package firstProgram;

class demo1{
	int a = 200;
	void fun() {
		System.out.println("JAVA");
	}
	
}


class demo2 extends demo1{
	float b = 78.65f;
	void fun() {
		System.out.println("PYTHON");
	}


}
	class demo3 extends demo2{
		 char  c= 'A';
			void fun() {
				System.out.println("SPRING");
			}
		}
	
	class demo4 extends demo3{
		String s = "HUSSAIN";
		void fun() {
			System.out.println("HIBERNET");
		}
		void display() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(s);
		}
	}



public class Demo2 {

	public static void main(String[] args) {
		demo4 d4 = new demo4();
		d4.display();
		d4.fun();
		d4.fun();
		d4.fun();
		d4.fun();

	}

}
