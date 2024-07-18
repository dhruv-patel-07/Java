public class Employee {
    private String name,emial,desig,addres;
    private int salary;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", emial=" + emial + ", desig=" + desig + ", addres=" + addres + ", salary="
                + salary + "]";
    }
    public String getEmial() {
        return emial;
    }
    public void setEmial(String emial) {
        this.emial = emial;
    }
    public String getDesig() {
        return desig;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    }
    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
