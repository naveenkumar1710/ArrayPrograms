package Array;
import java.util.Arrays;
public class ToFIndNegativeElementIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {-10,20,-30,40,-50};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;// Atlast the count will be 3 because 3 negative numbers
			}
		}
		int[]negativeArr=new int[count];
		 int j=0;// This variable is for storing the number from 0 index value
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]<0) {
				 negativeArr[j]=arr[i];
				 j++;
			 }
		 }
		 System.out.println(Arrays.toString(negativeArr));
	}

}
