package week3.day1;

public class Palindrome {
	public static void main(String[] args) {
		
		
		String nameWord="racecar";
		
		char[] myName=nameWord.toCharArray();
		
	    String rev="";
	    
	    for(int i=myName.length-1;i>=0;i--) {
	    	rev=rev+myName[i];
	    }
	    if(nameWord.equals(rev)) {
	    	System.out.println("the given string is palindrome");
	    }
	    else {
	    	System.out.println("the given string is not palindrome");
			}
		}
		
		
}
