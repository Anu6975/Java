package String_Tasks;
import java.util.Scanner;

public class Task1_CharacterCount {
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = s.nextLine();

        System.out.print("\nTotal Character Count is: "+str.length());

    }
}
