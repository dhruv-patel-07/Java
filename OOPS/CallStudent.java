class CallStudent{
public static void main(String[] args) {
    Student stu = new Student();
    stu.setName("Dhurv");
    stu.setRollNo(31);
    int rollNo = stu.getRollNo();
    String name = stu.getName();
    // System.out.println("Name: "+name+"\nRollNo : "+rollNo);
    System.out.println(stu);
}
}