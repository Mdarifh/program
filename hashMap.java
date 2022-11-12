package firstProgram;

import java.util.HashMap;
import java.util.Scanner;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> Details = new HashMap<String,String>();
		
		Details.put("FirstName", "ARIF");
		Details.put("SurName", "HUSSAIN");
		Details.put("LastName", "HUSSAIN");
		Details.put("PHONE-NUMBER", "8789752830L");
		Details.put("PASSWORD", "hussnarif");
		Details.put("Email", "mdimranzama3110gmail.com");
		Details.put("ADDRESS", "BTM");
		Details.put("DOB", "20-09-1995");
		Details.put("GENDER", "MALE");
		System.out.println(Details.get("FirstName"));
		System.out.println(Details.size());
		System.out.println(Details.isEmpty());
		System.out.println(Details.containsKey("SurName"));
		System.out.println(Details.containsValue("HUSSAIN"));
		System.out.println(Details);
		System.out.println(Details.remove("SurName"));
		System.out.println(Details);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		String key = sc.next();
		System.out.println("Enter the value");
		String value = sc.next();
		if(Details.containsKey(key)) {
			Details.put(key, value);
		}
		Details.putIfAbsent(key,value);
		System.out.println(Details);

	}

}
