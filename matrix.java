package firstProgram;

public class matrix {
	
	
	public static void print2d(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
	}

	public static void main(String[] args) {
	int[][] a = {{1,2,3,4},
		          {5,6,7,8},
		           {9,10,11,12}};
	
			print2d(a);
		
		// TODO Auto-generated method stub

	}

}
