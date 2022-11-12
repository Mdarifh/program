package firstProgram;
class Exam extends Thread{
	public void run() {
		System.out.println("character printing started");
		for (int i = 65; i <=77; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing completed");
	}
}



public class Pro {

	public static void main(String[] args) {
		System.out.println("Main Thread Started and estd connetion");
		Exam e = new Exam();
		e.start();
	/*	try {
			e.join();
		}
		catch(InterruptedException e1) {
			e1.printStackTrace();
		}*/
		System.out.println("Main Method Completed and closed connection");

	}

}
