package day05_Concatenation;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String word = "";
        while (scanner.hasNext()) {
            word = scanner.next() + "\n" + word;
        }
        System.out.println(word);
    }

}
/*import java.util.Scanner;
import java.util.*;

class Main {
         public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in);
                 List<String> nameList = new ArrayList<>();
                 while (scanner.hasNext()) {
                    nameList.add(scanner.next());
                }
                for (int i = nameList.size() - 1; i >= 0; i--) {
                         System.out.println(nameList.get(i));
                }
        }
*/

