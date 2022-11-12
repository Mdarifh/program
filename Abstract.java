package firstProgram;


abstract class bird{
	abstract void fly();
	abstract void eat(); 
	}

abstract class Eagle extends bird{
	void fly() {
		System.out.println("Eagle is Flies at Greate Height");
	}
}
class SerpentEagle extends Eagle{
	void eat(){
		System.out.println("Serpant Eagle is hunt over the ,mountain and eats");
	}
	
}
class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("Golden Eagle is hunt over the ,mountain and eats");
	}
}







public class Abstract {

	public static void main(String[] args) {
		SerpentEagle sp= new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();
		sp.eat();
		sp.fly();
		ge.fly();
		ge.eat();

	}

}
