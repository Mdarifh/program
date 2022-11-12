package firstProgram;

import java.util.Scanner;

public class CaesarCipher {
	public static String caesarCipher(String s, int k) {
	    k = k%26;
	    String res = "";
	    for(int i = 0; i<s.length(); i++){
	        if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	        {
	            
	            if((s.charAt(i)+k)>=65 && (s.charAt(i)+k)<=90)
	            {
	            res = res +(char)(s.charAt(i)+k);
	            }
	            else{
	                res = res + (char)(s.charAt(i)+k-26);
	            }
	            
	        }
	     
	            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
	                if((s.charAt(i)+k)>=97 && (s.charAt(i)+k)<=122){
	                    res = res + (char)(s.charAt(i)+k);
	                }
	                else{
	              res = res +(char)(s.charAt(i)+k-26);  
	            }
	        }    
	            else
	            {
	                res = res + s.charAt(i);
	            }
	    }
	    return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int k = scan.nextInt();
		String result = caesarCipher(s,k);
		System.out.println(result);
		
	}

}
