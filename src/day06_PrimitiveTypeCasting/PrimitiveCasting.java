package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
  //now explicit
        int x = 55;
        short y = (short)x;
        System.out.println(x + " = " + y);

        long j = 6_000_000;
        short k = (short)j;

        System.out.println(j + " = " + k);

        double l = 10.8;
        float m = (float)l;
        int s = (int) m;
        System.out.println(l + " = " + s);



    }
}
