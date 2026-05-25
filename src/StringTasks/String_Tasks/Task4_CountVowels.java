package String_Tasks;
import java.util.Scanner;
public class Task4_CountVowels {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = s.nextLine();

        int vowels=0,consonants=0;
        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
                        str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowel Count: "+vowels + "\nConsonant Count: "+ consonants);

    }
}
