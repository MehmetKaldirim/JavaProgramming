package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>() ;
        List<Integer> number1 = Arrays.asList(1,2,3,4,5);

        ArrayList<String> names = new ArrayList<>();
        List<String> name1 = Arrays.asList("Java","DS","Spring");

        System.out.println(numbers);
        System.out.println(number1);
        System.out.println(names);
        System.out.println(name1);


    }


}

