package day10_NestedIfAndTernaries;

import java.util.Scanner;

public class NameOfMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of Month");
        int numberOfMonth = sc.nextInt();
        sc.close();
        boolean boundaryCheck = numberOfMonth >= 1 && numberOfMonth <= 12;


        if (boundaryCheck) {
            switch (numberOfMonth) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("Fabruary");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("Agust");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }

        } else {
            System.out.println("Invalid number for month of Year");
        }
    }
}
