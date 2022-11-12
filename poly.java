package firstProgram;

class Plain{
	void takeOff() {
		System.out.println("Plain is take off");
	}
	void fly() {
		System.out.println("plain is flying");
	}
	void land() {
		System.out.println("plain is landing");
	}
}	
	class CargoPlain extends Plain{
		void takeOff() {
			System.out.println("Cargo Plain take Off at long size runway");
		}
		void fly()  {
			System.out.println("cargo Plain fly is low height");
		}
		void land()  {
			System.out.println("Cargo Plain landing at at greate runway");
		}
	}	
		class PassengerPlain extends Plain{
			void takeOff() {
				System.out.println("Passenger Plain take Off at medium size runway");
			}
			void fly() {
				System.out.println("Passenger plain is flying is medium height");
			}
			void land() {
				System.out.println("Passenger Plain is landing  at medium size runway");
			}
		
	}
		class FighterPlain extends Plain{
			void takeOff() {
				System.out.println("Fighter Plain take Off at small size runway");
			}
			void fly() {
				System.out.println("Fighter plain is flying at great height");
			}
			void land() {
				System.out.println("Fighter Plain is landing at small size runway");
			}
		}

		class Airport{
			void permit(Plain ref) {
				ref.takeOff();
				ref.fly();
				ref.land();
			}
		}


public class poly {

	public static void main(String[] args) {
		CargoPlain cp= new CargoPlain();
		PassengerPlain pp= new PassengerPlain();
		FighterPlain fp = new FighterPlain();
		
		Airport a= new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);
		
		/*Plain ref;
		ref = cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		
		ref = fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		*/
	
		
	}

}
