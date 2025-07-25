package oops3;
class Calc{
	// Method Overloading : same argument type, but different argument count
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	public void add(int a, int b, int c, int d, int e) {
		System.out.println(a+b+c+d+e);
	}
}
class AdvancedCalc{
	// Var-Args :: 0 to n
	public void add(int... args) {
		int sum = 0;
		for(int data : args) {
			sum += data;
		}
		System.out.println(sum);
	}
}
public class TestAppInt {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10, 20, 30, 40);
		c.add(10, 20, 30, 40, 50);
		
		System.out.println();
		AdvancedCalc ac = new AdvancedCalc();
		ac.add();
		ac.add(10);
		ac.add(10, 20);
		ac.add(10, 20, 30);
		ac.add(10, 20, 30, 40);
		ac.add(10, 20, 30, 40, 50);
	}
}