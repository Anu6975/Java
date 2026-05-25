import java.util.*;
import java.lang.String;
public class Task6_StringReverse {
        public static void main(String arg[]) {
            Scanner s = new Scanner(System.in);

            System.out.print("Enter a String: ");
            String str = s.nextLine();

            for (int i =str.length() -1 ; i>=0; i--){
                System.out.print(str.charAt(i));
        }
    }
}
