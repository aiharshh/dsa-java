package Conditionals;
import java.util.Scanner;
public class profitLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cost Price: ");
		int cp = sc.nextInt();
		System.out.println("Enter the Selling Price: ");
		int sp = sc.nextInt();
		
		if(cp>sp) System.out.println("Profit is : "+ (sp-cp));
		if(sp>cp) System.out.println("Loss is : "+(cp-sp));
		if(cp==sp) System.out.println("Neither Profit, Nor Loss");
	}
}