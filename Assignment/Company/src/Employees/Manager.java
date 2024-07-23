package Employees;

public class Manager extends Employee{
private String dept;
	public Manager(String name, int salary, int employeeId,String dept) {
		super(name, salary, employeeId);
		this.dept = dept;
		// TODO Auto-generated constructor stub
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Manager [dept=" + dept + ", getDept()=" + getDept() + ", getName()=" + getName() + ", getSalary()="
				+ getSalary() + ", getEmployeeId()=" + getEmployeeId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	


	

}
