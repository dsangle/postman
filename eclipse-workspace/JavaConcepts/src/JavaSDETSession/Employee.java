package JavaSDETSession;

public class Employee {

	private int empID;
	private String name;
	
	public String toString() {
		System.out.println(empID+" "+name);
		return "name";
	}
	
	public Employee () {
		empID=145;
	    name="Sangale";
	}
	
	public Employee (int empID,String name) {
		this.empID=empID;
		this.name=name;
	}
}
