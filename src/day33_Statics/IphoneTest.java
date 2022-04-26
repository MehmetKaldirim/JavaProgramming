package day33_Statics;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.method1();
        System.out.println( Iphone.OS );
        Iphone.printOperatingSystem();
        iphone.printOperatingSystem();
    }

}
