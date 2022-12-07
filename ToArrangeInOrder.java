package Array;

import java.util.Arrays;

public class ToArrangeInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,50,60,20,30};
		for(int j=1;j<arr.length;j++) {
			for(int i=0;i<arr.length-j;i++) {
				if(arr[i]>arr[i+1]) {
				int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
