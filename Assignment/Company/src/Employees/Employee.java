package Employees;

public class Employee {
	public Employee(String name, int salary, int employeeId) {
		super();
		this.name = name;
		this.salary = salary;
		this.employeeId = employeeId;
	}
	private String name;
	private int salary,employeeId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
}
