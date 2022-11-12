package firstProgram;


   class prac{
	/*final int a = 200;
	}

*/


	final void fun() {
		System.out.println("Inside parent class method ");
	}
	
   }
   class pre extends prac{
	  void fun() {
		   System.out.println("Inside child class overriding method");
	
	   		} 
	   }	
   
   
	public class dem {
	public static void main(String[] args) {
		pre p = new pre();
		p.fun();
		
	
	/*prac d = new prac();
		System.out.println(d.a);
			
		d.a = 300;
		System.out.println(d.a);
		
*/
			
		
		}
   }