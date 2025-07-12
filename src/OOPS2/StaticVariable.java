package OOPS2;
class LoanApp{
	// static variable
	static float rateofInterest = 9.5f;
}
public class StaticVariable {
	public static void main(String[] args) {
		System.out.println(LoanApp.rateofInterest);
		System.out.println(new LoanApp().rateofInterest);
	}
}
