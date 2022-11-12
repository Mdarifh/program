package firstProgram;

public class NaturalNo {

	public static void main(String[] args) {
/*		int n = 10;
		int sum = 0;
	//	 sum = n*(n+1)/2;
	//	System.out.println(sum);
		for (int i = 0; i <=n; i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
		*/
		int[] ar =  {2,3,4,5,6,7};
		int n = ar.length;
		int sum = 0;
		
		for (int i = 0; i <n; i++) {
			sum = sum + ar[i];
			
		}
		System.out.println(sum);
	}

}
