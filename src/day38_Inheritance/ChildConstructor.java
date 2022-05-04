package day38_Inheritance;

public class ChildConstructor extends SuperConstructor {
    private String name;

    public ChildConstructor(String name) {
        super("super duper papa");
        this.name = name;
        System.out.println("i am an " + this.name);
    }

    public ChildConstructor(){
        System.out.println("piç baby");
    }
}
