package Array;

import java.util.Arrays;

public class ToAddTwoArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {10,20,30,40};
		int[]arr2= {10,20};
		int bigIndex=arr1.length>arr2.length?arr1.length:arr2.length;// terinary operator
		int []arr3=new int[bigIndex];
		for(int i=0;i<bigIndex;i++) {
			if(i<arr1.length) {
				arr3[i]=arr1[i];
			}
			if(i<arr2.length) {
				arr3[i]=arr3[i]+arr2[i];
			}
		}
		System.out.println(Arrays.toString(arr3));
	}

}
