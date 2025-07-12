package oops3;
class Calculator{
	public void add(int a, int b) {
		System.out.println("int-int Agrument");
	}
	public void add(float a, float b) {
		System.out.println("float-float Agrument");
	}
	public void add(double a, double b) {
		System.out.println("double-double Agrument");
	}
}
public class Test {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10, 20);
		c.add(10.5f, 20.5f);
		c.add(10.0, 20.0);
	}
}
