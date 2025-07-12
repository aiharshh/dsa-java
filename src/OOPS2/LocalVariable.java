package OOPS2;
class Calculator{
	public void add(int a, int b) {
		int result = a + b;
		System.out.println("The sum is : "+result);
	}
}
public class LocalVariable {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10,20);
	}
}
 // OUTPUT  ::  The sum is : 30