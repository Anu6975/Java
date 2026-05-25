package String_Tasks;
import java.util.Scanner;

public class Task5_DuplicateChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = s.nextLine().toLowerCase();
        char[] chars = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            int count=0;
            char ch=str.charAt(i);
            if (ch==' '){
                continue;
            }

            for (int j=0; j<str.length(); j++){
                if(ch==chars[j]){
                    count++;
                    chars[j]= ' ';
                }
            }

            if(count>1){
                System.out.print(ch + " Count: "+ count);
                System.out.println();
            }
        }

    }
}
