package week3.day1;
import java.util.Arrays;


public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		  int[] a= {1,2,3,5,7,8,11,2,12,11,5};
		  Arrays.sort(a);
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++) {
				  if(a[i]==a[j]) {
					  System.out.println(a[i]);
				  }
			  }
		  }
		
		}

}
