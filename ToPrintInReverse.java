package Array;

import java.util.Arrays;

public class ToPrintInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={10,20,30,40,50};
		int len=arr.length-1;
		int[]copyArr=new int[arr.length];
		int j=0;
		for(int i=len;i>=0;i--) {
			copyArr[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(copyArr));
	}
	

}
