package firstProgram;

public class matrixBoundary 
{
	public static void main(String[] args) 
	{
	/*	int[][] ar = {{1,2,3,4,5},
			 	     {6,7,8,9,10},
		              {11,12,13,14,15},
		              {16,17,18,19,20},
		               {21,22,23,24,25}};
			int i=0, j= 0;
			for(j = 0; j<ar.length; j++) 
			{
				System.out.println(ar[i][j] +" ");
			}
	
			j = ar.length-1;
			for(i = 1; i<ar.length; i++) 
			{
				System.out.println(ar[i][j] +" ");
			}
			
			i = ar.length-1;
			for(j =ar.length-2; j>=0; j--) 
			{
				System.out.println(ar[i][j] +" ");
			}
			
			j = 0;
			for(i =ar.length-2; i>0; i--) 
			{
				System.out.println(ar[i][j] +" ");
			}*/
		int n = 36;
		int i = 5;
		int offMask = ~(1 << i);
		System.out.println(n & offMask);
	}
		
}