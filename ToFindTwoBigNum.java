package Array;

public class ToFindTwoBigNum{
	public static void main(String[]args) {
		int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
		int[] arr= {10,20,30,40,70};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
		}
		System.out.println(max1+" "+max2);
	}

}
