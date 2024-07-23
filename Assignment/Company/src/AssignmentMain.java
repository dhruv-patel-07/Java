
import Utility.EmployeeUtilities;
import Employees.Manager;
import Employees.Developer;

public class AssignmentMain {
	public static void main(String[] args) {
		Manager manager = new Manager("Dhurv",12000000,07,"Tester");
		Developer developer = new Developer("Dhurv",12000000,07,"python");
		System.out.println(manager);
		
		EmployeeUtilities EU = new EmployeeUtilities();
		EU.display(manager);
		EU.display(developer);
		
	}
}
