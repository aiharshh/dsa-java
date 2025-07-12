package OOPS2;

class Person{
//	Instance Variable
	public String name;
	public String address;
	public int age;
}
class Student extends Person{
	public int marks;
	public String grade;
//	Constructor
	Student(String name, String address, int age,int marks, String grade){
		System.out.println(" Called during Object Creation ...");
		this.name = name;
		this.address = address;
		this.age = age;
		this.marks = marks;
		this.grade = grade;
	}
//	Normal Method
	public void disp() {
		System.out.println("Name    is: "+ name);
		System.out.println("Address is:"+address);
		System.out.println("Age is   :"+age);
		System.out.println("Marks are: "+marks);
		System.out.println("Grade is : "+grade);
	}
}
public class TestApp_ {
	public static void main(String[] args) {
		Student student = new Student ("Heisenberg","Albequerque",52,99,"A");
		student.disp();
	}
}
