package JavaPractical.Day19;

public class String_RemoveSpaces {
	public static void main(String[] args) {
		String str= "Hello       World!!",  string="";
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)== ' ' && count==0) {
				string +=str.charAt(i);
				count++;
			}
			else if(str.charAt(i)!=' ' ){
				string +=str.charAt(i);
			}
		}
		System.out.println(string);
	}
}
