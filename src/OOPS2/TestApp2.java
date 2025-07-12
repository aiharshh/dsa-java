package OOPS2;
class Employee{
	String name;
	int age;
	Employee(){
		System.out.println("Employee Constructor Called");
	}
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age :  "+age);
	}
}
public class TestApp2 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display();
	}
}
