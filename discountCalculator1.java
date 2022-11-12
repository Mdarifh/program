package firstProgram;
import java.util.Scanner;
public class discountCalculator1 {

	
	
	float discCalculator(float i,float s,float t,float n) {
		float d1 = 0.0f;
		float d2 = 0.0f;
		d1 = i * (7.0f / 100) + s * (3.0f / 100) + t * (2.0f / 100) + n * (1.0f / 100);
		System.out.println(d1);
		float total = i + s + t + n;
		
		if (total <= 25000) 
		{
		d2 = 0.0f;
		} 
		else if (total >= 25001 && total <= 50000)
		{
		d2 = total * (5.0f / 100);
		} else if (total >=50001 && total<= 100000)
		{
		d2 = total * (7.0f / 100);
		
		}
	
		else
		{
			d2 =total *(10.0f/100);
		}
		System.out.println(d2);
		if (d1 > d2)
		{
			return d1;
		} 
		else
		{
			return d2;

	 }
}
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Amount of Iron");
			float iron = scan.nextFloat();
			System.out.println("Enter the Amount of steel");
			float steel = scan.nextFloat();
			System.out.println("Enter the Amount of tungsten");
			float tun = scan.nextFloat();
			System.out.println("Enter the Amount of Nickle");
			float nic = scan.nextFloat();
			discountCalculator1 d=new discountCalculator1();
			System.out.println(d.discCalculator(iron,steel,tun,nic));
			

		}
}

