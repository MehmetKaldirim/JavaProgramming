package day10_NestedIfAndTernaries;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the score");
        int score = sc.nextInt();

        boolean boundaryChack = score >= 0 && score <= 100;

        boolean a = score >= 90;
        boolean b = score >= 80;
        boolean c = score >= 70;
        boolean d = score >= 60;
        boolean f = score >= 0;

        if (boundaryChack) {
            if (a) { //if the student made an A
                System.out.println("Excellent");
            } else if (b) { // if the student made a B
                System.out.println("Great");
            } else if (c) { // if the student made a C
                System.out.println("Good");
            } else if (d) { // if the student made a D
                System.out.println("Passed");
            } else if (f) { // if the student made F
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid Note");
        }

    }
}
/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */
