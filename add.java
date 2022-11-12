package firstProgram;
import java.util.Scanner;
public class add {
	public static void main(String[] args) {
		int [][]  a= new int[4][4];
		int [][]  b= new int[4][4];
		int [][]  c= new int[4][4];
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of first matrix:");
		 for(int i=0;i<a.length;i++) 
			{
				for(int j=0; j<a[i].length;j++) 
				{
					a[i][j] =sc.nextInt();
				}
			}
		 System.out.println("Enter the value of Second matrix:");
		 for(int i=0;i<a.length;i++) 
			{
				for(int j=0; j<a[i].length;j++) 
				{
					b[i][j] =sc.nextInt();
				}
			}
		 for(int i=0;i<a.length;i++) 
			{
				for(int j=0; j<a[i].length;j++) 
				
				{
					c[i][j] = a[i][j] + b[i][j];
					
				}
				
				}
		 		System.out.println("Sum of two matrix:");
		 		 for(int i=0;i<a.length;i++) 
					{
						for(int j=0; j<a[i].length;j++) 
						{
							System.out.print(c[i][j] +" ");
						}
						System.out.println();
					}		
	}

}



