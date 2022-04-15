package day23_CustomMethodVoid;

public class CustomMethodWithParameters {

    public static void main(String[] args) {

        //  oddOrEven(); // the method demands additional info to complete its task

        oddOrEven(11);

        ageOfPerson(1978);




    }


    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){ // 10

        if(number % 2 == 0){
            System.out.println(number +" is even number");
        }else{
            System.out.println(number +" is odd number");
        }

    }


    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;

        System.out.println("Your age is: "+age);

    }



}