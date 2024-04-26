
import java.util.*;

public class t1 {

    public static int chek(int a) {
        if (a >= 65 && a <= 90) {
            return 1;
        } else if (a >= 97 && a <= 122) {
            return 0;
        } else {

            return -1;
        }
    }

    public static void main(String[] args) {
        // Write a program that takes a character as input and prints 1, 0, or -1
        // according to the following rules.
        // 1, if the character is an uppercase alphabet (A - Z).
        // 0, if the character is a lowercase alphabet (a - z).
        // -1, if the character is not an alphabet.
        // Write your code here my code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        Character s = sc.next().charAt(0);
        int a = (int) s;
        System.out.println(chek(a));

    }
}
