package day12_Scanner;

import java.util.Scanner;

public class CircleF {

    public static void main(String[] args) {

        System.out.println("Please enter the radius of the circle in cm: ");

        Scanner scan = new Scanner(System.in);
        float radius = scan.nextFloat();
        float perimeter = (float) (radius*2 *3.14);
        float area = (float) (radius*radius*3.14);

        System.out.println("Area of the circle is: " + perimeter + " cm");
        System.out.println("Perimeter of the circle is: " + area + " cm");


    }
}