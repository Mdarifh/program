package firstProgram;

class pen{
	String colour;
	String type;
	String brand;
	
	public void write(){
		System.out.println("Writing Somthing");
	}
	public void penColour() {
		System.out.println(this.colour);
		System.out.println(this.type);
		System.out.println(this.brand);
	}
}

class Student{
	int Id;
	String name;
	int age;
	String School;
	String address;
	long phone;
	public void data() {
		System.out.println(this.Id);
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.School);
		System.out.println(this.address);
		System.out.println(this.phone);
		
	}
	Student(int Id,String name, int age, String School, String address, long phone){
		this.Id = Id;
		this.name = name;
		this.age = age;
		this.School = School;
		this.address = address;
		this.phone = phone;
		
		
	}
	
}

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	pen p1 = new pen();
		p1.colour = "red";
		p1.type = "Gel";
		p1.brand = "cello";
		p1.write();
		
		pen p2 = new pen();
		p2.colour = "blue";
		p2.type = "ballpen";
		p2.brand = "waterman";
		p1.penColour();
		p2.penColour();*/
		
		Student s= new Student(105,"MD ARIF HUSSAIN",23,"DAV","ARA",8789752830l);
	/*	s.Id = 105;
		s.name = "MD ARIF HUSSAIN";
		s.age = 23;
		s.School = "DAV";
		s.address = "ARA";
		s.phone = 8789752830l;*/
		s.data();
		
	}

}
