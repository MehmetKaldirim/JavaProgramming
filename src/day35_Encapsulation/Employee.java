package day35_Encapsulation;

public class Employee {
    private String name;
    private int age;
    private int idNumber;
    private String department;
    private String position;

    public Employee() {
        this.name = "";
        this.age = 0;
        this.idNumber= 0;
        this.department = "";
        this.position = position;
    }

    public Employee(String name,int idNumber) {
        this.name = name;
        this.idNumber= idNumber;
        this.department = "";
        this.position = "";
    }

    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idNumber=" + idNumber +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}