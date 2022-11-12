package firstProgram;

import java.util.Scanner;

class CircularRotation {
	static int[] CircularRotation(int[] arr, int k,int[] q) {
		int[] res = new int[q.length];
		int[] b = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[(i+k)%arr.length]=arr[i];
			}
		for (int i = 0; i < q.length; i++) {
			res[i] = b[q[i]];
		}
			return res;
		}
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {2,4,5};
		int q[] =   {3,6,7};
		
		int[] Result = (CircularRotation(arr,2,q));
		for (int i = 0; i < Result.length; i++) {
			System.out.println(Result);

		}
	}

}
