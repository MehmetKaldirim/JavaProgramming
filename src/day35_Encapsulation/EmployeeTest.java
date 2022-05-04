package day35_Encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Björn",1200);
        Employee e3 = new Employee("Luc",1200,"Sıcherheit","Wachmann");

        System.out.println(e1.getName()+ " " + e1.getIdNumber() + " " + e1.getDepartment());
        System.out.println(e2.getName()+ " " + e2.getIdNumber() + " " + e2.getDepartment());
        System.out.println(e3.getName()+ " " + e3.getIdNumber() + " " + e3.getDepartment());

        e1.setName("Math");
        e1.setAge(44);
        e1.setIdNumber(5180);
        e1.setDepartment("IT");
        e1.setPosition("Backend Developer");

        System.out.println(e1.getName()+ " " + e1.getIdNumber() + " " + e1.getDepartment() + " " + e1.getPosition());
        System.out.println(e1.toString());
    }



}
