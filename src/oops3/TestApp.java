package oops3;
class Sample{
	public void methodOne(String s) {
		System.out.println("String version...");
	}
	public void methodOne(StringBuffer o) {
		System.out.println("StringBuffer version...");
	}
	public void methodOne(Object o) {
		System.out.println("Object version...");
	}
}

public class TestApp {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.methodOne(new String("WalterWhite")); //String
		s.methodOne(new StringBuffer("Heisenberg")); // StringBUffer
//		s.methodOne(null);
	}
}
