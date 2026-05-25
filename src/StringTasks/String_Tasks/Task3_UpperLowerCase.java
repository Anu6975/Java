package String_Tasks;
import java.util.Scanner;

public class Task3_UpperLowerCase {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = s.nextLine();

        System.out.println("Uppercase String: " + str.toUpperCase());
        System.out.println("Lowercase String: " + str.toLowerCase());

    }
}