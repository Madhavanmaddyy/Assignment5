package week3.day1;
import java.util.Arrays;

public class MissingElementInArray{
	public static void main(String[] args) {
			int[] arr= {1,4,2,5,7,6,8,9};
			Arrays.sort(arr);
			int j=0;
			for(int i=0;i<arr.length;i++){
				j=j+1;
				if(arr[i]!=j) {
				System.out.println(j);
				break;
				}
			}	
			
		}


}
