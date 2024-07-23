package Utility;

import Employees.Employee;
import Employees.Manager;
import Employees.Developer;

public class EmployeeUtilities {
	public void display(Employee employee) {
			System.out.println("Employee Name : "+employee.getName());
			System.out.println("Employee Salary : "+employee.getSalary());
			System.out.println("Employee ID : "+employee.getEmployeeId());
	}
}
