package firstProgram;

public class moveZero {

	public static void main(String[] args) {
		
		int[] a =  {3,7,4,6,0,6,0,8,0,3};
		int count = 0;
		int i;
		for (i= 0; i < a.length; i++) {
			
			if(a[i+count]==0) {
				count++;
				}
			a[i]=a[i+count];
			
		}
	

		while(i>=0) {
			a[i]=0;
			i++;
		}
		

	}

}
