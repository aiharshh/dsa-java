package OOPS2;
class Student1{
	String name;
	int age;
	// Constructor
	Student1(String name, int age){
		this.name = name;
		this.age = age;
	}
	// instance method
	public void display() {
		System.out.println("Name is :: "+name);
		System.out.println("Age is  :: "+age);
	}
}
public class Student_Static_Var {
	public static void main(String[] args) {
		Student1 std1 = new Student1("Jesse Pinkman",26);
		std1.display();
		Student1 std2 = new Student1("Gustavo Fring",43);
		std2.display();
	}
}
