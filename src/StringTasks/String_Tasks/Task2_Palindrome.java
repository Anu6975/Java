package String_Tasks;
import java.util.Scanner;

public class Task2_Palindrome {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = s.nextLine();
        String str2 = new String("");

        //Reversing The String
        for (int i =str.length() -1 ; i>=0; i--){
           str2 += str.charAt(i);
        }
        //Palindrome Check
        if(str.equalsIgnoreCase(str2)){
            System.out.println("Entered String is Palindrome");
        }
        else{
            System.out.println("Entered String is not Palindrome");
        }
    }
}
