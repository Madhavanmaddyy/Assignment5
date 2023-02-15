package week3.day1;

public class RemoveDuplicates {
	public static void main(String[] args) {
		   int count=0;
		    String replaced="";
			String text="java is a good programming language . java is object oriented language ";
			String[] splitted=text.split("[.\\s]+");
			for(int i=0;i<splitted.length;i++)
				for(int j=i+1;j<splitted.length;j++)
				{ 
					if(splitted[i].equals(splitted[j]))
	                    count++;
					 replaced=text.replace(splitted[j],"it");
					
				}
			text=replaced;
			System.out.println(text);
		
	}

}
