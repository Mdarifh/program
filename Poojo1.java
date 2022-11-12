package firstProgram;

import java.util.TreeSet;

class Flight implements Comparable<Flight>{
	private String departure;
	private String name;
	private float duration;
	private int price;
	
	
	public Flight(String departure, String name, float duration, int price) {
		super();
		this.departure = departure;
		this.name = name;
		this.duration = duration;
		this.price = price;
		
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "[departure=" +  departure +" , name = "+name+ ",duration="+duration+", price=" +price+"]";
	}
	
	public int compareTo(Flight f2) {
		//String s1 = this.name;
		//String s2 = f2.name;
		//return s1.compareTo(s2);
		
		
		
		Integer p1= this.price;
		Integer p2 = f2.price;
		return p1.compareTo(p2);
	}
	
}

public class Poojo1 {

	public static void main(string[] args) {
		Flight f1 = new Flight("21:00","Indigo",2.5f, 5000);
		Flight f2 = new Flight("23:30","Goair", 5.0f,7000);
		Flight f3= new Flight("04:30","Spicejet",1.5f,2500);
		Flight f4 = new Flight("16:00","Vistara",4.5f,5500);
		Flight f5= new Flight("21:00","Airindigo",3.5f,6000);
		Flight f6 = new Flight("09:00","Indigo",4.0f,6500);
		Flight f7 = new Flight("11:00","Spicejet",3.7f,9000);
		Flight f8= new Flight("13:00","Goair",2.0f,8000);
		
		
		TreeSet<Flight> List = new TreeSet<Flight>();
		List.add(f1);
		List.add(f2);
		List.add(f3);
		List.add(f4);
		List.add(f5);
		List.add(f6);
		List.add(f7);
		List.add(f8);

		for(Flight flight:List) {
		System.out.println(flight);
		}

	}


}
