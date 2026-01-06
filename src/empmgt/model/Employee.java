package empmgt.model;

public class Employee {
   private int id;
   private String fname;
   private String lname;
   private String desig;
   private String dept;
   private double salary;
   private int age;
   private String addr;

    public Employee(String id, String fname, String lname, String desig, String salary, String age, String addr) {
        this.id= id;
        this.fname = fname;
        this.lname = lname;
        this.desig = desig;
        this.salary = salary;
        this.age = age;
        this.addr = addr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

   
   
}
