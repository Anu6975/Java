package Day6;

public class String_Demo {
	
	public static void main(String[] args) {
		// 1. Creating Strings (Literal vs Object)
		String str1 = "Hello";                  
		String str2 = "Hello";               
		String str3 = new String("Hello"); 
		        
		// 2. .equals() vs == Operator
		System.out.println("str1 == str2: " + (str1 == str2));   
        System.out.println("str1 == str3: " + (str1 == str3));   
        System.out.println("str1.equals(str3): " + str1.equals(str3)); 
        
        
        // 3. Using Common String Methods
        String text = "  Java Programming  ";
        
        System.out.println("Original Length: " + text.length()); 
        
        // -> Trimming spaces from edges
        text = text.trim();
        System.out.println("After Trim: " + text);
        
        // -> Changing Case
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        
        // -> Checking if it contains a sequence
        System.out.println("Contains 'Java': " + text.contains("Java"));
        
        // -> Getting a specific character by index
        System.out.println("Character at index 0: " + text.charAt(0));
        
        // -> Replacing characters
        System.out.println("Replace 'a' with 'o': " + text.replace('a', 'o'));
		
	}

}
