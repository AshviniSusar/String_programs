package Program1;

public class ReverseEachWordInString {
public static void main(String args[]) {
	
	String str="Welcome in Java";
	String[] words = str.split(" ");
	String ReverseString=" ";
	
	for(String w:words) {
		String Reverseword=" ";
		for(int i=w.length()-1;i>=0;i--) {
			Reverseword=Reverseword+w.charAt(i);
		}
		
		ReverseString=ReverseString+Reverseword+" ";
	}
	
	
	System.out.println(str);
	
}
}
