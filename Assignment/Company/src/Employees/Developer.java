package Employees;

public class Developer extends Employee{
private String Tech;

public Developer(String name, int salary, int employeeId,String Tech) {
	super(name, salary, employeeId);
	this.Tech = Tech;
	// TODO Auto-generated constructor stub
}

	public String getTech() {
	return Tech;
}
public void setTech(String tech) {
	Tech = tech;
}

@Override
public String toString() {
	return "Developer [Tech=" + Tech + "]";
}

	

}
