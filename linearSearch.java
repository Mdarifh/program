package firstProgram;

public class linearSearch {
	
	static int linearSearch(int[] a, int key) {
		for(int i =0; i<a.length;i++) {
			if(a[i]==key) {
				return i;
				
			}
		}
		return -1;
		
	}
	
		
	

	public static void main(String[] args) {
		int [] a = {50,43,54,23,56,76};
		// TODO Auto-generated method stub
		int key = 76;
	System.out.println(linearSearch(a,key));
	

	}
	
	

}
