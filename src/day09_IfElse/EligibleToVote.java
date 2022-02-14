package day09_IfElse;
import java.util.Scanner;
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the age of " + name);
        int age = sc.nextInt();
        System.out.println("Enter the citizenship of " + name);
        String citizen = sc.next();

        boolean isEligible = age >= 21 && citizen.equals("USA"); //True

        // Eligible
        if (isEligible) { // True
            System.out.println(name + "is Eligible for vote");
        } else { // !True ==> not true==> false
            System.out.println(name + " is Not Eligible for vote");
        }


    }

}
// if he is 21 and US Citizen then he can vote