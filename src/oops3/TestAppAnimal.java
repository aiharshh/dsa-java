package oops3;
class Animal{}
class Monkey extends Animal{
	
}

class AnimalApp{
	public void m1(Monkey m) {
		System.out.println("Monkey version...");
	}
	public void m1(Animal a) {
		System.out.println("Animal Version...");
	}
}
public class TestAppAnimal {

	public static void main(String[] args) {
		AnimalApp a = new AnimalApp();
		Monkey m = new Monkey();
		a.m1(m); //m(Monkey) ----> Monkey
		
		Animal animal = new Animal();
		a.m1(animal); //animal ----> Animal
		
		Animal an = new Animal();
		a.m1(an); //an(Animal) ----> Animal
	}
}
