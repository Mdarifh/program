package firstProgram;

public class addOfMatrix {
	 static void printMatrix(int[][] a) 
	 {
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0; j<a[i].length;j++) 
			{
				System.out.print(a[i][j] +" ");
				
			System.out.println();
			}
		}
	 }
		static  int[][] add(int[][] A, int[][] B ,int n)
		{
			int C[][] = new int[n][n];
			for(int i=0;i<n;i++) 
			
				for(int j=0;j<n;j++) 
			
					C[i][j] = A[i][j] +B[i][j];
			 return C;
			}

		public static void main(String[] args) {
		int n = 4;
		int[][] A = {{2,3,4,5},
				     {7,5,3,2},
				     {6,9,4,2},
				     {1,3,6,5}};
		System.out.println("\n Matrix of A");
	    System.out.println( addOfMatrix.printMatrix(A, n, n);
		
		int [][] B = {{3,4,5,1},
				      {6,9,1,3},
				      {1,9,8,5},
				      {2,4,3,6}};
		System.out.println("\n Matrix of B");
		addOfMatrix.printMatrix(B,n,n);
		
		int [][] C = add(A,B,n);
		System.out.println("\n Resultant of C");
	addOfMatrix.printMatrix(C,n,n);
		
		

	}

}
