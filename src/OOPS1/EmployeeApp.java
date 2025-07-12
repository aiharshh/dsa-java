package OOPS1;
class Employee{
	// Data Security
	private String eid;
	private String ename;
	private int eage;
	private String eaddress;
	
	// setter methods
	public void setEid(String eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public void setEAddress(String eaddress) {
		this.eaddress = eaddress;
	}
	
	// Getter methods
	public String getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public int getEage() {
		return eage;
	}
	public String getEAddress() {
		return eaddress;
	}
}
public class EmployeeApp {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEid("WW69");
		e.setEname("Heisenberg");
		e.setEage(52);
		e.setEAddress("Alberque");
		
		// 
		System.out.println("Eid     is : "+e.getEid());
		System.out.println("Name    is : "+e.getEname());
		System.out.println("Address is : "+e.getEAddress());
		System.out.println("Eage    is : "+e.getEage());
	}
}
