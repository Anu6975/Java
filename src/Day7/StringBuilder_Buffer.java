package Day7;

public class StringBuilder_Buffer {
	
	public static void main(String arg[]) {

        StringBuffer buffer = new StringBuffer("Welcome");
        StringBuilder builder = new StringBuilder("Welcome");
        
        buffer.append(" Students");
        builder.append(" Students");
        
        System.out.println("StringBuffer Output: " + buffer); 
        System.out.println("StringBuilder Output: " + builder);
        
        // 3. Testing the .equals() Method 
        StringBuffer buffer2 = new StringBuffer("Welcome Students");
        System.out.println("buffer.equals(buffer2): " + buffer.equals(buffer2)); 		// False
        
        
        // 4. Common Shared Methods (Both classes share these)
        StringBuilder text = new StringBuilder("Hello");

        text.insert(5, " Java!");
        System.out.println("After Insert: " + text); // Prints: Hello Java
        
        text.reverse();
        System.out.println("After Reverse: " + text); // Prints: avaJ olleH
        
        text.reverse();
        text.delete(5, 10);
        System.out.println("After Delete: " + text); // Prints: Hello
	}

}
