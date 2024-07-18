
import java.util.Scanner;

public class Emp {
    public void CreateArrayOfEmployee(){
        Scanner sc = new Scanner(System.in);
        int[] no = new int[12];
        Employee[] emp = new Employee[12];
        for (int i = 0; i < 3; i++) {
            emp[i] = new Employee();
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("Enter Employee Name : ");
            emp[j].setName(sc.nextLine());
            System.out.println("Enter Employee Desg  : ");
            emp[j].setDesig(sc.nextLine());

        }
        for(int k = 0; k<3;k++){
            System.out.println(emp[k]);
        }
    }
}
