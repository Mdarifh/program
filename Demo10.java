package firstProgram;


class Test1 extends Thread{
	public void run(){
		System.out.println("Typing is stated");
		for (int i = 0; i <=5; i++) {
			System.out.println("Typing...");
			try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}		
		System.out.println("Typing completed");
		
	}

	
}
class Test2 extends Thread{
	public void run() {
		System.out.println("code completion stated");
		for (int i = 0; i <=5; i++) {
			System.out.println("code completion");
			try {
			Thread.sleep(5000);
			}
		catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
		
	}

	
}
class Test3 extends Thread{
	public void run(){
		System.out.println("Auto Saving started");
		for (int i = 0; i <=5; i++) {
			System.out.println("Auto Saving... ");
			try {
			Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
	
public class Demo10 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.setName("Typing");
		
		Test2 t2 = new Test2();
		t2.setName("complete");
	    t2.setDaemon(true);
		
		Test3 t3 = new Test3();
		t3.setName("Save");
		t3.setDaemon(true);
	
		t1.start();
		t2.start();
		t3.start();
	
		
	
	
	}



}


