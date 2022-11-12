package firstProgram;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// perimeter of rectangle
	
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter the length rectangle: ");
		float length= sc.nextFloat();
		System.out.print("Enter the width rectangle : ");
	    float width = sc.nextFloat();
		float perimeter = 2*(length+width);
		System.out.println("The perimeter of Rectangle is:" + perimeter);
		float area = length*width;
		System.out.println("The area of Rectangle is:" + area);
		
		*/
		
	/*	int index = 0;
		int arr[] = new int[10];
		System.out.print("enter a decimal number:");
		int num = sc.nextInt();
		while(num>0) {
			arr[index]= num%2;
			index++;
			num = num/2;
		}
		System.out.print("Binary number is:");
		for(int i = index;i>=0;i--) {
			System.out.print(arr[i]);
		}
		*/
		
		char ch1 = 'A';
		char ch2 = 'Z';
		char ch3 = 'b';
		char ch4 = 'z';
		
		int asciivalue1 = ch1;
		int asciivalue2 = ch2;
		int asciivalue3 = ch3;
		int asciivalue4 = ch4;
		System.out.println("The ASCII value of: " + ch1 + " is " + asciivalue1);
		System.out.println("The ASCII value of: " + ch2 + " is " + asciivalue2);
		System.out.println("The ASCII value of: " + ch3 + " is " + asciivalue3);
		System.out.println("The ASCII value of: " + ch4 + " is " + asciivalue4);
		
	}

}
 