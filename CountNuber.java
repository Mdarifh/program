package firstProgram;

public class CountNuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num  = 2345656783433l;
		
		int even_count = 0;
		int odd_count = 0;
		while(num>0) {
			long rev = num%10;
			if(rev%2==0) {
				even_count++;
			}
			else {
				odd_count++;
				
			}
			num = num/10;
		}
		System.out.println("Number of Even Count-"+ even_count);
		System.out.println("Number of odd Count-"+ odd_count);


		
	}

}
