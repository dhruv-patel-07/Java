public class Student{
   private int rollNo;
    private String Name;

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}