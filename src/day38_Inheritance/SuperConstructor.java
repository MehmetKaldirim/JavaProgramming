package day38_Inheritance;

public class SuperConstructor {

    private String name;

    public SuperConstructor() {
        System.out.println("empty dady");
    }

    public SuperConstructor(String name) {
        this.name = name;
        print(name);
    }

    void print(String name ){
        System.out.println("I am a super  " + name );
    }
}
