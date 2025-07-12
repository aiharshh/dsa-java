package oops4;
class Plane{
	public void takeOff() {
		System.out.println("Plane is taking off...");
	}
	public void fly() {
		System.out.println("Plane is Flying...");
	}
	public void land() {
		System.out.println("Plane is Landing...");
	}
}
class PassengerPlane extends Plane{
	public void takeOff() {
		System.out.println("PassengerPlane is taking off...");
	}
	public void fly() {
		System.out.println("PassengerPlane is Flying...");
	}
	public void land() {
		System.out.println("PassengerPlane is Landing...");
	}
}
class CargoPlane extends Plane{
	public void takeOff() {
		System.out.println("Cargo-Plane is taking off...");
	}
	public void fly() {
		System.out.println("Cargo-Plane is Flying...");
	}
	public void land() {
		System.out.println("Cargo-Plane is Landing...");
	}
}
class FighterPlane extends Plane{
	public void takeOff() {
		System.out.println("FighterPlane is taking off...");
	}
	public void fly() {
		System.out.println("FighterPlane is Flying...");
	}
	public void land() {
		System.out.println("FighterPlane is Landing...");
	}
}
class Airport{
	public void allowPlane(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
	}
}
public class Aeroplane {
	public static void main(String[] args) {
		PassengerPlane p = new PassengerPlane();
		CargoPlane c = new CargoPlane();
		FighterPlane f = new FighterPlane();
		
		Airport a = new Airport();
		a.allowPlane(p);
		a.allowPlane(c);
		a.allowPlane(f);
	}
}
