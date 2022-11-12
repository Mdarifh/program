package firstProgram;
import java.util.Scanner;
public class determined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int[2][2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println("Enter the Number in Pocket ["+i+"]["+j+"]");
				a[i][j] = sc.nextInt();
			}
		}
		
			System.out.println("Enter the Matrix......");
			for(int i=0;i<a.length;i++) 
			{
				for(int j=0;j<a.length;j++)
				{
					System.out.print(a[i] [j]+" ");
				}
				System.out.println();
			}

		}
	}


