package day10_NestedIfAndTernaries;

import java.util.Scanner;

public class NameOfDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        System.out.println("Enter the number of day");
        int numOfDay = sc.nextInt();
        boolean boundaryChack = numOfDay >= 1 && numOfDay <= 7;
        System.out.println(boundaryChack ?
            numOfDay == 1 ? "Monday": numOfDay == 2 ? "Tuesday":
            numOfDay == 3 ? "Wednesday": numOfDay == 4 ? "Thursday":
            numOfDay == 5 ? "Freiday": numOfDay == 6 ? "Saturday":
            "Sunday":"Invalid number for day of weeks");
    }
}


