package week3.day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test="i am a software tester";
		String[] split=test.split(" ");
		for(int i=0;i<split.length;i++) {
			if(i%2==1) {
				char[] r=split[i].toCharArray();
				for(int j=r.length-1;j>=0;j--) {
					System.out.print(r[j]);
				}
				
			
				
			}
			else System.out.print(split[i]);
			System.out.print(" ");
		}
		
		}

}
