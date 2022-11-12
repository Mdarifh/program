package firstProgram;
import java.util.ArrayList;

class Flight{
	private String departure;
	private String name;
	private float duration;
	private int price;
	
	public Flight() {
		
	}
	
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
		return "[departure = "+departure+",name = "+name+", duration = "+duration+", price = "+price+"]";
	}
}

public class Alpha {

	public static void main(String[] args) {
		Flight f1 = new Flight("21:30","Indigo",2.5f,5000);
		Flight f2 = new Flight("23:00","Airgo",3.00f,65000);
		Flight f3 = new Flight("1:45","spicejet",5.5f,45000);
		Flight f4 = new Flight("4:15","AirIndia",6.25f,35000);
		Flight f5 = new Flight("6:30","Vista",10.35f,80000);
		Flight f6 = new Flight("8:45","Airgo",5.5f,6500);
		Flight f7 = new Flight("9:30","Indigo",2.30f,7000);
		Flight f8 = new Flight("10:00","Indigo",1.5f,5000);
		Flight f9 = new Flight("11:40","Vista",3.5f,2500);
		Flight f10 = new Flight("12:00","spicejet",7.5f,3000);
		
		ArrayList<Flight> flightlist = new ArrayList<Flight>();
		flightlist.add(f1);
		flightlist.add(f2);
		flightlist.add(f3);
		flightlist.add(f4);
		flightlist.add(f5);
		flightlist.add(f6);
		flightlist.add(f7);
		flightlist.add(f8);
		flightlist.add(f9);
		flightlist.add(f10);
		
		
		for(Flight flight:flightlist) {
			
			System.out.println(flight);
		}

	}

}
