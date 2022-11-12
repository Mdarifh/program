package firstProgram;

public class RemoveDublicate {
	static int removeDublicate(int[] ar) {
		int r = 0;
		for(int i = 1; i < ar.length; i++) {
			if(ar[r]!= ar[i]){
				r++;
				ar[r] = ar[i];
				
				}
				
			}
				return r+1;
			
		}

	public static void main(String[] args) {
		
			int[] ar = {2,2,2,3,3,4,6,6,7,8,9,9};
			
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i]+" ");
			}
			
			int r= removeDublicate(ar);
			System.out.println();
			
			for (int i = 0; i < r; i++) {
				System.out.print(ar[i]+" ");
			}

	}

}
