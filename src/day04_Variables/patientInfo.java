package day04_Variables;

import java.util.Scanner;

public class patientInfo {
    public static void main(String[] args) {
        //Enter your code here
  /*      int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;
        String email,street,name,lastName,city,state;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        name = scan.next();
        System.out.println("Enter your last name");
        lastName = scan.next();
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.nextLine();
        //to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        city = scan.next();
        System.out.println("Enter your state");
        state = scan.next();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextInt();
        System.out.println("Enter your weight");
        weight = scan.nextInt();
        System.out.println("Are you married");
        isMarried = scan.nextBoolean();

        System.out.printf ("Patient personal information Full name: " +lastName+", "+name+ "Address: " + street +", " + state + " " + zipcode + " Contacts: work phone number - " + workPhoneNumber + ", personal phone number - "+ personalPhoneNumber+ ", email: " + email +" Age: "+ age +" Height: " + height+" Weight: "+weight+" pounds "+ "  Married?: "+isMarried);

    }
}
public class Main {
  public static void main(String[] args) {
    //Enter your code here
    */
    String firstName, lastName, fullName, email, street, state, city, address, contacts;
    int age, zipcode;
    double height, weight;
    boolean isMarried;
    long workPhoneNumber, personalPhoneNumber;
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
    firstName = scan.nextLine();
    System.out.println("Enter your last name");
    lastName = scan.nextLine();
   // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
     // continue for city
     System.out.println("Enter your city");
     city = scan.nextLine();
     System.out.println("Enter your state");
     state = scan.nextLine();
     System.out.println("Enter your zip code");
     zipcode = scan.nextInt();
     System.out.println("Enter your work phone number");
     workPhoneNumber = scan.nextLong();
     System.out.println("Enter your personal phone number");
  personalPhoneNumber = scan.nextLong();
     System.out.println("Enter your age");
     age = scan.nextInt();
     System.out.println("Enter your height");
     height = scan.nextDouble();
     System.out.println("Enter your weight");
     weight = scan.nextDouble();
     System.out.println("Are you married?");
     isMarried = scan.nextBoolean();

     contacts = "Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", email: "+email;

     fullName = lastName+", "+firstName;

     address = street + ", " + city + ", " + state + " " + zipcode;

     System.out.println("Patient personal information\nFull name: " + fullName + "\nAddress: " + address + "\n" + contacts + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + " pounds"+"\nMarried?: " + isMarried);






  }
}