package day10_NestedIfAndTernaries;

import java.util.Scanner;

public class GradeReportWithTernaries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score of Student");
        int score = sc.nextInt();
        System.out.println(score >= 0 && score <= 100 ? (score >= 90) ? "Excellent" :
                (score >= 80) ? "Great" : (score >= 70) ? "Good" :
                (score >= 60) ? "Passed" : "Failed" : "Invalid Score");
    }
}

