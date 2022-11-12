package firstProgram;
import java.util.Scanner;
public class DiscountCalculator {
	float DiscountCalculator(float iron,float steel,float tun,float nic) {
			float d1 = 0.0f;
			float d2 = 0.0f;
			d1 = iron * (7.0f / 100) + steel * (3.0f / 100) + tun * (2.0f / 100) + nic * (1.0f / 100);
			float total = iron + steel + tun + nic;
			
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
				System.out.println(DiscountCalculator(iron,steel,tun,nic));
				

	}
}	