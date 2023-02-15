package week3.day1;
import java.util.Arrays;

public class Anagram {
		public static void main(String[] args) {
			String a="stops";
			String b="potss";
			
			char[] c=a.toCharArray();
			char[] d=b.toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(d);
			
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(d));
		}


}
