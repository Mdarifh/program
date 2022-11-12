package firstProgram;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a = new int[5];
		
		System.out.print("Enter the age Student");
		a[0]=sc.nextInt();
		System.out.println("Enter the age Student");
		a[1]= sc.nextInt();
		System.out.println("Enter the age Student");
		a[2]= sc.nextInt();
		System.out.println("Enter the age Student");
		a[3]= sc.nextInt();
		System.out.println("Enter the age of Student");
		a[4]=sc.nextInt();
	
		System.out.println("Enter the age a" ) ;
		System.out.println( a[0] ) ;
		System.out.println( a[1 ] ) ;
		System.out.println( a[2 ] ) ;
		System.out.println( a[ 3 ] ) ;
		System.out.println( a[4] ) ;
		
	}

}
